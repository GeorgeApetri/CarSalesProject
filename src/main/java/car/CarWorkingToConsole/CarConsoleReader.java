package car.CarWorkingToConsole;

import car.Car;

import java.util.Scanner;

public class CarConsoleReader {

    public Car readCarData() {

        Car car = new Car();
        Scanner scanner = new Scanner( System.in );

        System.out.println("car configurator");

        System.out.println("category");
        car.setCategory( scanner.nextLine() );

        System.out.println("combustible");
        car.setCombustible( scanner.nextLine() );

        System.out.println("transmission");
        car.setTransmission( scanner.nextLine() );

        System.out.println("engine capacity");
        car.setEngineCapacity( scanner.nextInt() );

        System.out.println("tank capacity");
        car.setTankCapacity( scanner.nextInt() );

        System.out.println("fuel consumption");
        car.setFuelConsumption( scanner.nextDouble() );

        System.out.println("emission");
        car.setEmissions( scanner.nextInt() );

        System.out.println("color");
        car.setColor( scanner.nextLine() );

        return car;

    }

    public Car editCategory(Car car){

        Scanner scanner = new Scanner(System.in);
        System.out.println("edit car data");
        System.out.println("edit category");
        car.setCategory(scanner.nextLine());

        return car;
    }

}
