package client;

import com.google.gson.Gson;
import util.GenericStore;
import util.Paths;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClientFileStorage extends GenericStore<Client> {

    public ClientFileStorage() {
        this.clientList = readJson();
    }

    private List<Client> clientList;


    @Override
    public Client add(Client value) {
        value.setIdClient(generateId());
        clientList.add( value );
        writeJson();
        return value;
    }

    private int generateId() {
        int max = 0;
        for (Client client: clientList) {
            if (max < client.getIdClient()) {
                max = client.getIdClient();
            }
        }
        return max + 1;
    }

    @Override
    public void delete(Client value) {
        clientList.remove( value );
        writeJson();
    }

    @Override
    public void update(Client value) {
        Client oldClient = getById( value.getIdClient() );
        clientList.remove( oldClient );
        clientList.add( value );
        writeJson();

    }

    @Override
    public List<Client> getAll() {
        Collections.sort(clientList);
        return clientList;
    }


    @Override
    public Client getById(int id) {
        for (Client client: clientList) {
            if (client.getIdClient() == id) {
                return client;
            }
        }
        return null;
    }

    @Override
    public String getFilePath() {
        return Paths.CLIENT_FILE_PATH;
    }

    @Override
    protected List<Client> getListFromJson(Gson gson, Reader reader) {
        return new ArrayList<>( Arrays.asList(gson.fromJson(reader, Client[].class)));
    }
}

