package client;

import java.util.Scanner;

public class ClientService {

    public void insertClientDetail() {

        System.out.println();
        System.out.println( "introduceti numele persoanei pentru care se face aceasta configurare: " );
        System.out.println();
        
    }


    public void previewClientDetails() {

        Scanner scanner = new Scanner( System.in );
        String name = scanner.nextLine();

        Client client = new Client( name );
        System.out.println( "configurare pentru " + client.getName() + ":" );
        
    }
}
