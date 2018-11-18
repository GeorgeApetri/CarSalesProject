import client.*;

public class ConsoleMenu {

    public void displayClientMenu() {
        ClientCLI clientCLI = new ClientCLI();
        clientCLI.readClientDetails(  );
        clientCLI.displayClientDetails();
    }
}
