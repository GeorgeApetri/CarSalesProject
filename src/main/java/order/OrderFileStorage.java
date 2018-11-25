package order;

import java.util.ArrayList;
import java.util.List;

public class OrderFileStorage {

    private List<Order> orderList = new ArrayList<Order>(  );

    public Order addOrder(Order order) {
        order.setIdOrder(generateId());
        orderList.add( order );
        return order;
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

    public List<Order> getAll() {
        return orderList;
    }
}
