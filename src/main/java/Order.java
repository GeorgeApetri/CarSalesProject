import java.util.Scanner;

public class Order {

    private Car car;
    private Client client;

    public void orderCar(){


    }

    public void startConfigurator(){
        Car car = new Car();
        System.out.println("Please enter customer name: ");
        Scanner scanner = new Scanner(System.in);
        Client client = new Client(scanner.nextLine());

        System.out.println("Please enter car category: suv, hatchback, sedan");
        car.setCategory(scanner.nextLine());

        System.out.println("Please enter car combustible: diesel, benzine");
        car.setCombustible(scanner.nextLine());

        System.out.println("Please enter car transmission: manual, automatic");
        car.setTransmission(scanner.nextLine());

        System.out.println("Please enter car engineCapacity: 1.4, 1.6 , 2.0");
        car.setEngineCapacity(scanner.nextDouble());

        System.out.println("Please enter car tankCapacity: 50l, 60l, 70l");
        car.setTankCapacity(scanner.nextDouble());

        System.out.println("Please enter car fuelConsumption: 6%, 8%, 10%");
        car.setFuelConsumption(scanner.nextDouble());

        System.out.println("Please enter car emissions: 90g/km, 100g/km, 110g/km");
        car.setEmissions(scanner.nextDouble());

        System.out.println("Please enter car color: red, blue, black");
        car.setColor(scanner.nextLine());

        System.out.println("Configuration: " + car.getCategory() + " " + car.getColor() + "restul...");
    }


}
