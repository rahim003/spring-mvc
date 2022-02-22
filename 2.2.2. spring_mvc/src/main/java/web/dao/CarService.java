package web.dao;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCar(int id);
    List<Car>getAllCars();
}
