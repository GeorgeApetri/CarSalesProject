package client;

import java.util.List;

public class ClientService {

    ClientFileStorage clientFileStorage = new ClientFileStorage();

    public void addClient (Client client) {
        clientFileStorage.add( client );
    }

    public void deleteClient (Client client) {
        clientFileStorage.delete( client );
    }

    public Client getClientById (int id) {
        return clientFileStorage.getById( id );
    }

    public void updateClient (Client client) {
        clientFileStorage.update( client );
    }

    public List<Client> getAllClients() {
        return clientFileStorage.getAll();
    }

}
