package client;

public class Client implements Comparable<Client> {

    private int idClient;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;


    public Client() {

    }

    public Client(int idClient, String firstName, String lastName, String address, String email, String phone) {

        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;

    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int compareTo(Client o) {

//        if (idClient<o.idClient){
//            return -1;
//        } else if(idClient==o.idClient){
//            return 0;
//        } else {
//            return 1;
//        }
        return idClient - o.idClient;
    }


    @Override
    public String toString() {
        return idClient + "\t" + firstName + "\t" + lastName + "\t" + address + "\t" + email + "\t" + phone;
    }

}