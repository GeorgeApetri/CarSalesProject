package order;

import car.Car;
import client.Client;

public class Order implements Comparable<Order> {

    private int idOrder;
    private Client client;
    private Car car;
    private int quantity;

    public Order(int idOrder, Client client, Car car, int quantity) {
        this.idOrder = idOrder;
        this.client = client;
        this.car = car;
        this.quantity = quantity;
    }

    public Order() {

    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int compareTo (Order o) {
        return idOrder - o.idOrder;
    }

    @Override
    public String toString() {
        return "ID order: " + idOrder + "\n" + "client: " + client + "\n" + "car: " + car + "\n"
                + "quantity: " + quantity;
    }
}