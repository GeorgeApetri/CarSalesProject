package order;

import car.Car;
import client.Client;

import java.util.List;

public class OrderService {

    OrderFileStorage orderFileStorage = new OrderFileStorage();

    public void addTransaction(Client client, Car car, int quantity) {

        Order order = new Order(  );
        order.setClient( client );
        order.setCar( car );
        order.setQuantity( quantity );

        orderFileStorage.addOrder( order );
//        System.out.println(order.toString());

    }

    public List<Order> getAllOrder() {
        return orderFileStorage.getAll();
    }

}
