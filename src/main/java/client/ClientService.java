package client;
import java.util.Scanner;

public class ClientService {

    public void insertClientDetail() {

        System.out.println();
        System.out.println( "introduceti numele persoanei pentru care se face aceasta configurare: " );
        System.out.println();

        Scanner scanner = new Scanner( System.in );
        String name = scanner.nextLine();
        Client client = new Client( name );
        System.out.println( "configurare pentru " + client.getName() + ":" );


    }


    public void previewClientDetails() {



    }
}
