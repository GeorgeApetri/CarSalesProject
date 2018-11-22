package car;

import java.util.ArrayList;
import java.util.List;

public class CarFileStorage extends GenericStore<Car> {

    private List<Car> carList = new ArrayList<Car>();

    public Car add(Car value) {
        value.setIdCar( generateId() );
        carList.add( value );
        return value;
    }

    private int generateId() {
        int max = 0;
        for (Car car : carList) {
            if (max < car.getIdCar()) {
                max = car.getIdCar();
            }
        }return max + 1;
    }

    public void delete(Car value) {
        carList.remove( value );

    }

    public void update(Car value) {
        Car oldCar = getById( value.getIdCar() );
        carList.remove( oldCar );
        carList.add( value );

    }

    public List<Car> getAll() {
        return carList;
    }

    public Car getById(int id) {
        for (Car car : carList) {
            if (car.getIdCar() == id) {
                return car;
            }
        }
        return null;
    }
}
