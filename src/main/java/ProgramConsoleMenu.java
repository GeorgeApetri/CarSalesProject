import car.carWorkingToConsole.CarConsoleMenu;
import client.clientWorkingToConsole.ClientConsoleMenu;
import order.orderWorkingToConsole.OrderConsoleMenu;

import java.util.Scanner;

public class ProgramConsoleMenu {

    private ClientConsoleMenu clientConsoleMenu = new ClientConsoleMenu();
    private CarConsoleMenu carConsoleMenu = new CarConsoleMenu();
    private OrderConsoleMenu orderConsoleMenu = new OrderConsoleMenu();


    public void displayConsoleMenu() {

        System.out.println( "Program menu: \n" );
        System.out.println( "0  Exit" );
        System.out.println( "1  Cars" );
        System.out.println( "2  Clients" );
        System.out.println( "3  Orders \n" );

        Scanner scanner = new Scanner( System.in );
        int option;
        do {
            System.out.println( "Select menu option: " );
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    break;
                case 1:
                    carConsoleMenu.displayMenuCars();
                    break;
                case 2:
                    clientConsoleMenu.displayMenuClients();
                    break;
                case 3:
                    orderConsoleMenu.displayMenuOrders();
                    break;
            }

        } while (option != 0);

    }

}
