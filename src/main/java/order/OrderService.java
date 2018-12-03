package order;

import java.util.List;

public class OrderService {

    OrderFileStorage orderFileStorage = new OrderFileStorage();

    public void addOrder (Order order) {
        orderFileStorage.add( order );
    }

    public void deleteOrder (Order order) {
        orderFileStorage.delete( order );
    }

    public Order getOrderById (int id) {
        return orderFileStorage.getById( id );
    }

    public void updateOrder (Order order) {
        orderFileStorage.update( order );
    }

    public List<Order> getAllOrder() {
        return orderFileStorage.getAll();
    }

}
