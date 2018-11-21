package client.ClientWorkingToConsole;

import client.Client;

import java.util.Scanner;

public class ClientConsoleReader {

    public Client readClientData() {

        Client client = new Client(  );
        Scanner scanner = new Scanner( System.in );

        System.out.println("Add personal details");

        System.out.println("First name");
        client.setFirstName(scanner.nextLine());

        System.out.println("Last name");
        client.setLastName(scanner.nextLine());

        System.out.println("Address");
        client.setAddress(scanner.nextLine());

        System.out.println("Email address");
        client.setEmail(scanner.nextLine());

        System.out.println("Contact number");
        client.setPhone(scanner.nextInt());

        return client;
    }

    public Client editAddress(Client client){

        Scanner scanner = new Scanner(System.in);
        System.out.println("edit user data");
        System.out.println("edit address");
        client.setAddress(scanner.nextLine());

        return client;
    }

}
