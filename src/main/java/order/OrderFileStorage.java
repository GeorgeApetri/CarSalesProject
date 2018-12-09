package order;

import com.google.gson.Gson;
import util.GenericStore;
import util.Paths;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderFileStorage extends GenericStore<Order> {

    public OrderFileStorage() {
        this.orderList = readJson();
    }

    private List<Order> orderList;

    @Override
    public Order add(Order value) {
        value.setIdOrder(generateId());
        orderList.add( value );
        writeJson();
        return value;
    }

    private int generateId() {
        int max = 0;
        for (Order order: orderList) {
            if (max < order.getIdOrder()) {
                max = order.getIdOrder();
            }
        }
        return max + 1;
    }

    @Override
    public void delete(Order value) {
        orderList.remove( value );
        writeJson();

    }

    @Override
    public void update(Order value) {
        Order oldOrder = getById( value.getIdOrder() );
        orderList.remove( oldOrder );
        orderList.add( value );
        writeJson();

    }

    @Override
    public List<Order> getAll() {
        Collections.sort( orderList );
        return orderList;
    }

    @Override
    public Order getById(int id) {
        for (Order order : orderList) {
            if (order.getIdOrder() == id ) {
                return order;
            }
        }
        return null;
    }

    @Override
    public String getFilePath() {
        return Paths.ORDER_FILE_PATH;
    }

    @Override
    protected List<Order> getListFromJson(Gson gson, Reader reader) {
        return new ArrayList<>( Arrays.asList(gson.fromJson(reader, Order[].class)));
    }
}
