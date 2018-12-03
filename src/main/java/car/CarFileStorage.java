package car;

import util.GenericStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarFileStorage extends GenericStore<Car> {

    private static final String filePath = "D:\\JavaTest\\CarSalesManagement\\cars.json";

    private List<Car> carList = new ArrayList<>();

    @Override
    public Car add(Car value) {
        value.setIdCar( generateId() );
        carList.add( value );
        writeJson();
        return value;
    }

    private int generateId() {
        int max = 0;
        for (Car car : carList) {
            if (max < car.getIdCar()) {
                max = car.getIdCar();
            }
        }
        return max + 1;
    }

    @Override
    public void delete(Car value) {
        carList.remove( value );
        writeJson();
    }

    @Override
    public void update(Car value) {
        Car oldCar = getById( value.getIdCar() );
        carList.remove( oldCar );
        carList.add( value );
        writeJson();
    }

    @Override
    public List<Car> getAll() {
        Collections.sort( carList );
        return carList;
    }

    @Override
    public Car getById(int id) {
        for (Car car : carList) {
            if (car.getIdCar() == id) {
                return car;
            }
        }
        return null;
    }

    @Override
    public String getFilePath() {
        return filePath;
    }
}
