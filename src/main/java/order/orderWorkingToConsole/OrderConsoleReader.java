package order.orderWorkingToConsole;

import car.Car;
import car.CarService;
import client.Client;
import client.ClientService;
import order.Order;
import util.ServiceInstances;

import java.util.Scanner;

public class OrderConsoleReader {

    private ClientService clientService = ServiceInstances.getInstance().getClientService();
    private CarService carService = ServiceInstances.getInstance().getCarService();

    public Order readOrderData() {

        Order order = new Order(  );

        editOrderData( order );

        return order;
    }


    public Order editOrderData(Order order){

        System.out.println( "choose client by ID: " );
        for (Client client : clientService.getAllClients()) {
            System.out.println( client.toString() );
        }

        Scanner scanner1 = new Scanner( System.in );
        Client client = null;
        while (client == null) {
            int option = scanner1.nextInt();
            client = clientService.getClientById( option );
            order.setClient( client );
            if (client==null) {
                System.out.println("The client you choose doesn't exist. Please insert different ID");
            }
        }


        System.out.println( "choose car by ID: " );
        for (Car car : carService.getAllCar()) {
            System.out.println( car.toString() );
        }

        Scanner scanner2 = new Scanner( System.in );
        Car car = null;
        while (car == null) {
            int option2 = scanner2.nextInt();
            car = carService.getCarById( option2 );
            order.setCar( car );
            if (car==null) {
                System.out.println("The car you choose doesn't exist. Please insert different ID");
            }
        }


        System.out.println("choose quantity: ");
        Scanner scanner3 = new Scanner( System.in );
        int quantity = scanner3.nextInt();
        order.setQuantity( quantity );


        order.setTotalValue( order.getQuantity() * car.getPrice() );


        return order;
    }

}
