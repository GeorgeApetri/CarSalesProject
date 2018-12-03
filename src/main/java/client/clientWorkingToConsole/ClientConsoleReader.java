package client.clientWorkingToConsole;

import client.Client;

import java.util.Scanner;

public class ClientConsoleReader {

    public Client readClientData() {

        Client client = new Client(  );

        System.out.println("Add personal details: ");

        editClientData( client );

        return client;
    }

    public Client editClientData(Client client){

        Scanner scanner = new Scanner(System.in);

        System.out.println("First name: ");
        client.setFirstName(scanner.nextLine());

        System.out.println("Last name: ");
        client.setLastName(scanner.nextLine());

        System.out.println("Address: ");
        client.setAddress(scanner.nextLine());

        System.out.println("Email address: ");
        client.setEmail(scanner.nextLine());

        System.out.println("Contact number: ");
        client.setPhone(scanner.nextLine());

        return client;
    }

}
