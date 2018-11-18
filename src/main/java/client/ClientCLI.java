package client;

public class ClientCLI {


    public void readClientDetails() {

        ClientService clientService = new ClientService();
        clientService.insertClientDetail();

    }

    public void displayClientDetails () {

        ClientService clientService = new ClientService();
        clientService.previewClientDetails();

    }

}
