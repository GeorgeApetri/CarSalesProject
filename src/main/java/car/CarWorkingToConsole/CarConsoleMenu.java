package car.CarWorkingToConsole;

import car.Car;
import car.CarService;

import java.util.List;
import java.util.Scanner;

public class CarConsoleMenu {

    CarService carService = new CarService();
    CarConsoleWriter carConsoleWriter = new CarConsoleWriter();
    CarConsoleReader carConsoleReader = new CarConsoleReader();

    public void displayMenuCars() {

        Scanner scanner = new Scanner( System.in );
        int option;
        do {
            displayCarOption();
            System.out.println("select car option");
            System.out.println();
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    break;
                case 1:
                    displayCars();
                    break;
                case 2:
                    addCar();
                    break;
                case 3:
                    editCar();
                    break;
                case 4:
                    deleteCar();
                    break;
            }
        } while (option != 0);
    }

    private void displayCarOption() {

        System.out.println();
        System.out.println("car menu");
        System.out.println();
        System.out.println("0   exit");
        System.out.println("1   display all car");
        System.out.println("2   add car");
        System.out.println("3   edit car");
        System.out.println("4   delete car");
        System.out.println();

    }

    private void displayCars() {

        List<Car> allCar = carService.getAllCar();
        for (Car car : allCar) {
            carConsoleWriter.displayCarData( car );
        }

    }

    private void addCar() {

        CarConsoleReader carConsoleReader = new CarConsoleReader();
        Car car = carConsoleReader.readCarData();
        carService.addCar( car );
        System.out.println();
        System.out.println("car successfully added");
        System.out.println();

    }

    private void editCar() {

        Scanner scanner = new Scanner( System.in );
        System.out.println("which car do you want to edit? enter ID");
        int id = scanner.nextInt();
        Car car = carService.getCarById( id );
        car = carConsoleReader.editCategory( car );
        carService.updateCar( car );
        System.out.println();
        System.out.println("car successfully edited");
        System.out.println();

    }

    private void deleteCar() {

        Scanner scanner = new Scanner( System.in );
        System.out.println("which car do you want to delete? enter ID");
        int id = scanner.nextInt();
        Car car = carService.getCarById( id );
        carService.deleteCar(car);
        System.out.println();
        System.out.println("car successfully deleted");
        System.out.println();

    }

}
