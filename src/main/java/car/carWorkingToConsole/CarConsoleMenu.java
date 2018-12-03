package car.carWorkingToConsole;

import car.Car;
import car.CarService;
import util.ServiceInstances;

import java.util.List;
import java.util.Scanner;


public class CarConsoleMenu {

    CarService carService = ServiceInstances.getInstance().getCarService();
    CarConsoleWriter carConsoleWriter = new CarConsoleWriter();
    CarConsoleReader carConsoleReader = new CarConsoleReader();

    public void displayMenuCars() {

        Scanner scanner = new Scanner( System.in );
        int option;
        do {
            displayCarOption();
            System.out.println("select car option: \n");
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println( "Program menu: \n" );
                    System.out.println( "0  Exit" );
                    System.out.println( "1  Cars" );
                    System.out.println( "2  Clients" );
                    System.out.println( "3  Orders" );
                    System.out.println( "4  Validated Orders \n" );
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

        System.out.println("car menu: \n");
        System.out.println("0   exit");
        System.out.println("1   display all car");
        System.out.println("2   add car");
        System.out.println("3   edit car");
        System.out.println("4   delete car \n");

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
        System.out.println("car successfully added. \n");

    }

    private void editCar() {

        Scanner scanner = new Scanner( System.in );
        System.out.println("which car do you want to edit? enter ID: ");
        displayCars();
        int id = scanner.nextInt();
        Car car = carService.getCarById( id );
        car = carConsoleReader.editCarData( car );
        carService.updateCar( car );
        System.out.println("car successfully edited. \n");

    }

    private void deleteCar() {

        Scanner scanner = new Scanner( System.in );
        System.out.println("which car do you want to delete? enter ID: ");
        displayCars();
        int id = scanner.nextInt();
        Car car = carService.getCarById( id );
        carService.deleteCar(car);
        System.out.println("car successfully deleted. \n");

    }

}
