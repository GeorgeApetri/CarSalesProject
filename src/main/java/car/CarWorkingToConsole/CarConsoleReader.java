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
//        todo calculateTankCapacity
        System.out.println("calculateTankCapacity");

        System.out.println("fuel consumption");
//        todo calculateFuelConsumption
        System.out.println("calculateFuelConsumption");

        System.out.println("emission");
//        todo calculateEmission
        System.out.println("calculateEmission");

        System.out.println("color");
        car.setColor( scanner.next() );

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
