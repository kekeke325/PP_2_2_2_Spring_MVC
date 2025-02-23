package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Ford", "Aspire"));
        cars.add(new Car(2, "Bentley", "Azure"));
        cars.add(new Car(3, "Honda", "Element"));
        cars.add(new Car(4, "Volvo", "EX30"));
        cars.add(new Car(5, "BMW", "128"));
        if (count > 5) return cars;
        return cars.stream().limit(count).toList();
    }
}

