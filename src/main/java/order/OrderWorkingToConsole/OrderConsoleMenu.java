package order.OrderWorkingToConsole;

import car.CarService;
import client.ClientService;
import order.Order;
import order.OrderReader;
import order.OrderService;
import util.ServiceInstances;

import java.util.Scanner;

public class OrderConsoleMenu {

    private ClientService clientService = ServiceInstances.getInstance().getClientService();
    private CarService carService = ServiceInstances.getInstance().getCarService();
    private OrderService orderService = ServiceInstances.getInstance().getOrderService();

    public void displayMenuOrder() {

        Scanner scanner = new Scanner( System.in );
        int option;
        do {
            displayOrderOption();
            System.out.println();
            System.out.println("order option");
            System.out.println();
            option =scanner.nextInt();
            switch (option) {
                case 0:
                    break;
                case 1:
                    createNewTransaction();
                    break;
                case 2:
                    displayAllTransaction();
                    break;
            }
        }
        while (option != 0);
    }

    private void displayOrderOption() {

        System.out.println();
        System.out.println("display order option");
        System.out.println();
        System.out.println("1   create new transaction");
        System.out.println("2   display all transaction");

    }

    private void createNewTransaction() {

        System.out.println();
        System.out.println("choose client by ID");
        System.out.println();

        clientService.getAllClients();

        System.out.println();
        System.out.println("choose car by ID");
        System.out.println();

        carService.getAllCar();

        recordNewTransaction();


    }

    private void displayAllTransaction() {

    }

    private void recordNewTransaction() {

        OrderReader orderReader = new OrderReader();
        Order order = orderReader.readOrderData();
        orderService.addTransaction( order );




    }
}
