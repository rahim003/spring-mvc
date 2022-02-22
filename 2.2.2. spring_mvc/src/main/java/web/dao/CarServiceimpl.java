package web.dao;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarService {

    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "BMW", "Red"));
        cars.add(new Car(++CARS_COUNT, "Lexus", "Orange"));
        cars.add(new Car(++CARS_COUNT, "Porter", "Blue"));
        cars.add(new Car(++CARS_COUNT, "Mercedes-Benz", "White"));
        cars.add(new Car(++CARS_COUNT, "BMW", "Black"));
    }

    @Override
    public List<Car> getCar(int id) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < id; i++) {
            if (id>=5) {
                return cars;
            } else {
                carList.add(cars.get(i));
            }
        }
        return carList;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
