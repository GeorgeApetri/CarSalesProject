package order;

import util.GenericStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderFileStorage extends GenericStore<Order> {

    private static final String filePath = "D:\\JavaTest\\CarSalesManagement\\order.json";

    private List<Order> orderList = new ArrayList<Order>(  );

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
        return filePath;
    }
}
