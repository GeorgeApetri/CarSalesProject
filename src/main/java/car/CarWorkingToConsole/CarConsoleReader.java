package car.CarWorkingToConsole;

import car.Car;

import java.util.Scanner;

public class CarConsoleReader {

    public Car readCarData() {

        Car car = new Car();
        Scanner scanner = new Scanner( System.in );

        System.out.println( "car configurator" );
        System.out.println( "select car option" );
        System.out.println();

        int optionCategory;
        System.out.println( "category" );
        System.out.println();
        System.out.println( "1   suv" );
        System.out.println( "2   sedan" );
        optionCategory = scanner.nextInt();
        if (optionCategory == 1) {
            car.setCategory( "suv" );
        }
        if (optionCategory == 2) {
            car.setCategory( "sedan" );
        }


        int optionCombustible;
        System.out.println( "combustible" );
        System.out.println();
        System.out.println( "1   benzine" );
        System.out.println( "2   diesel" );
        optionCombustible = scanner.nextInt();
        if (optionCombustible == 1) {
            car.setCombustible( "benzine" );
        }
        if (optionCombustible == 2) {
            car.setCombustible( "diesel" );
        }


        System.out.println( "transmission" );
        car.setTransmission( scanner.next() );

        System.out.println( "engine capacity" );
        car.setEngineCapacity( scanner.nextInt() );

        System.out.println( "tank capacity" );
//        todo calculateTankCapacity
        System.out.println( "calculateTankCapacity" );

        System.out.println( "fuel consumption" );
//        todo calculateFuelConsumption
        System.out.println( "calculateFuelConsumption" );

        System.out.println( "emission" );
//        todo calculateEmission
        System.out.println( "calculateEmission" );

        System.out.println( "color" );
        car.setColor( scanner.next() );

        return car;

    }

    public Car editCategory(Car car) {

        Scanner scanner = new Scanner( System.in );
        System.out.println( "edit car data" );
        System.out.println( "edit category" );
        car.setCategory( scanner.nextLine() );

        return car;
    }

}
