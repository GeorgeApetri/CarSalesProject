import client.ClientWorkingToConsole.*;

import java.util.Scanner;

public class ProgramConsoleMenu {

    private ClientConsoleMenu clientConsoleMenu = new ClientConsoleMenu();

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
                    break;
                case 2:
                    clientConsoleMenu.displayMenuClients();
                    break;
                case 3:
                    break;
            }

        } while (option != 0);

    }

}
