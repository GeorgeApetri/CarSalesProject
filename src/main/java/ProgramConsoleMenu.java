import car.CarWorkingToConsole.CarConsoleMenu;
import client.ClientWorkingToConsole.ClientConsoleMenu;
import order.OrderWorkingToConsole.OrderConsoleMenu;

import java.util.Scanner;

public class ProgramConsoleMenu {

    private ClientConsoleMenu clientConsoleMenu = new ClientConsoleMenu();
    private CarConsoleMenu carConsoleMenu = new CarConsoleMenu();
    private OrderConsoleMenu orderConsoleMenu = new OrderConsoleMenu();


    public void displayConsoleMenu() {

        System.out.println( "Console Menu" );
        System.out.println();
        System.out.println( "0  Exit" );
        System.out.println( "1  Cars" );
        System.out.println( "2  Clients" );
        System.out.println( "3  Orders" );
        System.out.println();

        Scanner scanner = new Scanner( System.in );
        int option;
        do {
            System.out.println( "Select menu option" );
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
                    orderConsoleMenu.displayMenuOrder();
                    break;
            }

        } while (option != 0);

    }

}
