package order.orderWorkingToConsole;

import order.Order;
import order.OrderService;
import util.ServiceInstances;

import java.util.List;
import java.util.Scanner;

public class OrderConsoleMenu {

    OrderService orderService = ServiceInstances.getInstance().getOrderService();
    OrderConsoleWriter orderConsoleWriter = new OrderConsoleWriter();
    OrderConsoleReader orderConsoleReader = new OrderConsoleReader();

    public void displayMenuOrders() {

        Scanner scanner = new Scanner( System.in );
        int option;
        do {
            displayOrderOption();
            System.out.println("select order option: \n");
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println( "Program menu: \n" );
                    System.out.println( "0  Exit" );
                    System.out.println( "1  Cars" );
                    System.out.println( "2  Clients" );
                    System.out.println( "3  Orders" );
                    System.out.println( "4  Validated Orders \n" );
                    break;
                case 1:
                    displayOrder();
                    break;
                case 2:
                    addOrder();
                    break;
                case 3:
                    editOrder();
                    break;
                case 4:
                    deleteOrder();
                    break;
            }
        } while (option != 0);

    }

    private void displayOrderOption() {

        System.out.println("order menu: \n");
        System.out.println("0   exit");
        System.out.println("1   display all order");
        System.out.println("2   add order");
        System.out.println("3   edit order");
        System.out.println("4   delete order \n");

    }

    private void displayOrder() {

        List<Order> allOrders = orderService.getAllOrder();
        for (Order order: allOrders) {
            orderConsoleWriter.displayOrderData(order);
        }
        System.out.println();

    }

    private void addOrder() {

        OrderConsoleReader orderConsoleReader = new OrderConsoleReader();
        Order order = orderConsoleReader.readOrderData();
        orderService.addOrder( order );
        System.out.println("order successfully added. \n");

    }

    private void editOrder(){

        Scanner scanner = new Scanner( System.in );
        System.out.println("which order do you want to edit? enter ID: ");
        displayOrder();
        int id = scanner.nextInt();
        Order order = orderService.getOrderById( id );
        order = orderConsoleReader.editOrderData( order );
        orderService.updateOrder( order );
        System.out.println("order successfully edited. \n");

    }

    private void deleteOrder() {

        Scanner scanner = new Scanner( System.in );
        System.out.println("which order do you want to delete? enter ID: ");
        displayOrder();
        int id = scanner.nextInt();
        Order order = orderService.getOrderById( id );
        orderService.deleteOrder(order);
        System.out.println();
        System.out.println("order successfully deleted. \n");

    }
}
