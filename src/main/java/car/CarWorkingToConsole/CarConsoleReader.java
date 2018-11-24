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

        int optionTransmission;
        System.out.println( "transmission" );
        System.out.println();
        System.out.println( "1   automatic" );
        System.out.println( "2   manual" );
        optionTransmission = scanner.nextInt();
        if (optionTransmission == 1) {
            car.setTransmission( "automatic" );
        }
        if (optionTransmission == 2) {
            car.setTransmission( "manual" );
        }

        int optionEngineCapacity;
        System.out.println( "engine capacity" );
        System.out.println();
        System.out.println( "1   1500" );
        System.out.println( "2   2000" );
        optionEngineCapacity = scanner.nextInt();
        if (optionEngineCapacity == 1) {
            car.setEngineCapacity( 1500 );
        }
        if (optionEngineCapacity == 2) {
            car.setEngineCapacity( 2000 );
        }

        System.out.println( "tank capacity" );
//        todo calculateTankCapacity
        car.setTankCapacity( 70 );

        System.out.println( "fuel consumption" );
//        todo calculateFuelConsumption
        car.setFuelConsumption( 5.5 );

        System.out.println( "emission" );
//        todo calculateEmission
        car.setEmissions( 80 );

        int optionColor;
        System.out.println( "color" );
        System.out.println();
        System.out.println( "1   red" );
        System.out.println( "2   blue" );
        optionColor = scanner.nextInt();
        if (optionColor == 1) {
            car.setColor( "red" );
        }
        if (optionColor == 2) {
            car.setColor( "blue" );
        }

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
