package util;

import car.CarService;
import client.ClientService;
import order.OrderService;
import validatedOrder.ValidatedOrderService;

public class ServiceInstances {

    private static ServiceInstances serviceInstances = new ServiceInstances();

    private ClientService clientService = new ClientService();
    private CarService carService = new CarService();
    private OrderService orderService = new OrderService();
    private ValidatedOrderService validatedOrderService = new ValidatedOrderService();

    private ServiceInstances() {
    }

    public ClientService getClientService() {
        return clientService;
    }

    public CarService getCarService() {
        return carService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public static ServiceInstances getInstance() {
        if (serviceInstances == null) {
            serviceInstances = new ServiceInstances();
        }
        return serviceInstances;
    }
}

