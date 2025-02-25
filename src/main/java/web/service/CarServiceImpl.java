package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1, "Ford", "Aspire"));
        cars.add(new Car(2, "Bentley", "Azure"));
        cars.add(new Car(3, "Honda", "Element"));
        cars.add(new Car(4, "Volvo", "EX30"));
        cars.add(new Car(5, "BMW", "128"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 0) count = 0;
        return cars.stream().limit(count).toList();
    }
}

