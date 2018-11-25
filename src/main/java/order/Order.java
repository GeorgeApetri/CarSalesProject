package order;

public class Order {

    private int idOrder;
    private String firstName;
    private String lastName;
    private String address;
    private String category;
//    private Client client;
//    private Car car;


    public Order() {

    }

    public Order(int idOrder, String firstName, String lastName, String address, String category) {
        this.idOrder = idOrder;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.category = category;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

