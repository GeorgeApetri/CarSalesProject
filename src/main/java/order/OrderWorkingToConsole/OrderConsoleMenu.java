package order.OrderWorkingToConsole;

import car.Car;
import car.CarService;
import client.Client;
import client.ClientService;
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
            System.out.println( "order option \t" );
            option = scanner.nextInt();
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

        System.out.println( "display order option \t" );
        System.out.println( "1   create new transaction" );
        System.out.println( "2   display all transaction" );

    }

    private void createNewTransaction() {

        System.out.println( "choose client by ID \t" );
        for (Client client : clientService.getAllClients()) {
            System.out.println( client.toString() );
        }

        Scanner scanner1 = new Scanner( System.in );
        Client client = null;
        while (client == null) {
            int option = scanner1.nextInt();
            client = clientService.getClientById( option );
            if (client==null) {
                System.out.println("The client you choose doesn't exist. Please insert different ID");
            }
        }


        System.out.println( "choose car by ID \t" );
        for (Car car : carService.getAllCar()) {
            System.out.println( car.toString() );
        }

        Scanner scanner2 = new Scanner( System.in );
        Car car = null;
        while (car == null) {
            int option2 = scanner2.nextInt();
            car = carService.getCarById( option2 );
            if (car==null) {
                System.out.println("The car you choose doesn't exist. Please insert different ID");
            }
        }


        System.out.println("choose quantity");
        Scanner scanner3 = new Scanner( System.in );
        int quantity = scanner3.nextInt();

        orderService.addTransaction( client, car, quantity );

    }

    private void displayAllTransaction() {
        orderService.getAllOrder();
        System.out.print(orderService.getAllOrder().toString());
    }

}
