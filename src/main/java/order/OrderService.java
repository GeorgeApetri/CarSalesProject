package order;

public class OrderService {

    OrderFileStorage orderFileStorage = new OrderFileStorage();
//    private ClientService clientService = ServiceInstances.getInstance().getClientService();

    public void addTransaction(Order order) {

        orderFileStorage.addOrder( order );

//        Client client = clientService.getClientById( clientId );

    }


}
