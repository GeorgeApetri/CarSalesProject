package order.orderWorkingToConsole;

import order.OrderService;
import util.ServiceInstances;

public class OrderConsoleWriter {

    private OrderService orderService = ServiceInstances.getInstance().getOrderService();

    public void displayOrderData () {
        orderService.getAllOrder();
        System.out.println(orderService.getAllOrder().toString());

    }
}
