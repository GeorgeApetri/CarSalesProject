package client.ClientWorkingToConsole;

import client.Client;
import client.ClientService;

import java.util.List;
import java.util.Scanner;

public class ClientConsoleMenu {

    ClientService clientService = new ClientService();
    ClientConsoleWriter clientConsoleWriter = new ClientConsoleWriter();
    ClientConsoleReader clientConsoleReader = new ClientConsoleReader();

    public void displayMenuClients() {

        Scanner scanner = new Scanner( System.in );
        int option;
        do {
            displayClientOption();
            System.out.println("select option");
            System.out.println();
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    break;
                case 1:
                    displayClients();
                    break;
                case 2:
                    addClient();
                    break;
                case 3:
                    editClient();
                    break;
                case 4:
                    deleteClient();
                    break;
            }
        } while (option != 0);

    }

    private void displayClientOption() {

        System.out.println();
        System.out.println("client menu");
        System.out.println();
        System.out.println("0   exit");
        System.out.println("1   display all clients");
        System.out.println("2   add client");
        System.out.println("3   edit client");
        System.out.println("4   delete client");
        System.out.println();

    }

    private void displayClients() {

        List<Client> allClients = clientService.getAllClients();
        for (Client client: allClients) {
            clientConsoleWriter.displayClientData(client);
        }
        System.out.println();

    }

    private void addClient() {

        ClientConsoleReader clientConsoleReader = new ClientConsoleReader();
        Client client = clientConsoleReader.readClientData();
        clientService.addClient( client );
        System.out.println();
        System.out.println("client successfully added");
        System.out.println();

    }

    private void editClient(){

        Scanner scanner = new Scanner( System.in );
        System.out.println("which client do you want to edit? enter ID");
        int id = scanner.nextInt();
        Client client= clientService.getClientById( id );
        client = clientConsoleReader.editAddress( client );
        clientService.updateClient( client );
        System.out.println();
        System.out.println("client successfully edited");
        System.out.println();

    }

    private void deleteClient() {

        Scanner scanner = new Scanner( System.in );
        System.out.println("which client do you want to delete? enter ID");
        int id = scanner.nextInt();
        Client client = clientService.getClientById( id );
        clientService.deleteClient(client);
        System.out.println();
        System.out.println("client successfully deleted");
        System.out.println();

    }
}
