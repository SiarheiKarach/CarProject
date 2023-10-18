package edu.itacademy.secondtask.services;

import edu.itacademy.secondtask.model.Car;
import java.util.ArrayList;
import java.util.List;

public class FindCarsByPrice {
    public static Car[] findCarsByPriceService(Car[] cars, double startPrice, double endPrice) {
        List<Car> filteredByPrice = new ArrayList<>();
        for (Car car : cars) {
            if ((car.getCarPrice() >= startPrice) && (car.getCarPrice() <= endPrice)) {
                filteredByPrice.add(car);
            }
        }
        return filteredByPrice.toArray(new Car[0]);

    }
}