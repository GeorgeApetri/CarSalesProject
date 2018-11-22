package car;

import java.util.List;

public class CarService {

    CarFileStorage carFileStorage = new CarFileStorage();

    public void addCar (Car car) {
        carFileStorage.add( car );
    }

    public void deleteCar (Car car) {
        carFileStorage.delete( car );
    }

    public Car getCarById (int id) {
        return carFileStorage.getById( id );
    }

    public void updateCar (Car car) {
        carFileStorage.update( car );
    }

    public List<Car> getAllCar () {
        return carFileStorage.getAll();
    }
}
