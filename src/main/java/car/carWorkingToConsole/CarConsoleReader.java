package car.carWorkingToConsole;

import car.Car;
import car.CarPriceElements;

import java.util.Scanner;

public class CarConsoleReader {

    CarPriceElements carPriceElements = new CarPriceElements();

    public Car readCarData() {

        Car car = new Car();

        System.out.println( "car configurator" );
        System.out.println( "select car option: \n" );

        editCarData( car );

        return car;

    }


    public Car editCarData(Car car) {

        Scanner scanner = new Scanner( System.in );

        int value;

        int valueCategory = 0;
        int optionCategory;
        System.out.println( "category: " );
        System.out.println( "1   suv" );
        System.out.println( "2   sedan" );
        optionCategory = scanner.nextInt();
        if (optionCategory == 1) {
            car.setCategory( "suv" );
            valueCategory = valueCategory + carPriceElements.getSuv();
        }
        if (optionCategory == 2) {
            car.setCategory( "sedan" );
            valueCategory = valueCategory + carPriceElements.getSedan();
        }

        int valueCombustible = 0;
        int optionCombustible;
        System.out.println( "combustible: " );
        System.out.println( "1   benzine" );
        System.out.println( "2   diesel" );
        optionCombustible = scanner.nextInt();
        if (optionCombustible == 1) {
            car.setCombustible( "benzine" );
            valueCombustible = valueCombustible + carPriceElements.getBenzine();
        }
        if (optionCombustible == 2) {
            car.setCombustible( "diesel" );
            valueCombustible = valueCombustible + carPriceElements.getDiesel();
        }

        int valueTransmission = 0;
        int optionTransmission;
        System.out.println( "transmission: " );
        System.out.println( "1   automatic" );
        System.out.println( "2   manual" );
        optionTransmission = scanner.nextInt();
        if (optionTransmission == 1) {
            car.setTransmission( "automatic" );
            valueTransmission = valueTransmission + carPriceElements.getAutomatic();
        }
        if (optionTransmission == 2) {
            car.setTransmission( "manual" );
            valueTransmission = valueTransmission + carPriceElements.getManual();
        }

        int valueEngineCapacity = 0;
        int optionEngineCapacity;
        System.out.println( "engine capacity: " );
        System.out.println( "1   1500" );
        System.out.println( "2   2000" );
        optionEngineCapacity = scanner.nextInt();
        if (optionEngineCapacity == 1) {
            car.setEngineCapacity( 1500 );
            valueEngineCapacity = valueEngineCapacity + carPriceElements.getEc1500();
        }
        if (optionEngineCapacity == 2) {
            car.setEngineCapacity( 2000 );
            valueEngineCapacity = valueEngineCapacity + carPriceElements.getEc2000();
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

        int valueColor = 0;
        int optionColor;
        System.out.println( "color: " );
        System.out.println( "1   red" );
        System.out.println( "2   blue" );
        optionColor = scanner.nextInt();
        if (optionColor == 1) {
            car.setColor( "red" );
            valueColor = valueColor + carPriceElements.getRed();
        }
        if (optionColor == 2) {
            car.setColor( "blue" );
            valueColor = valueColor + carPriceElements.getBlue();
        }

        value = valueCategory + valueCombustible + valueTransmission + valueEngineCapacity + valueColor;

        car.setPrice(value);

        return car;
    }

}
