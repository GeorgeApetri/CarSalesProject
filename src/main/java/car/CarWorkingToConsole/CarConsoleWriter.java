package car.CarWorkingToConsole;

import car.Car;

public class CarConsoleWriter {

    public void displayCarData(Car car) {

        System.out.println(car.getIdCar() + " " + car.getCategory() + " " + car.getCombustible() + " "
                + car.getTransmission() + " " + car.getEngineCapacity() + " " + car.getTankCapacity() + " "
                + car.getFuelConsumption() + " " + car.getEmissions() + " " + car.getColor());
    }
}
