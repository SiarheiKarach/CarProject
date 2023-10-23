package edu.itacademy.secondtask.service;

import edu.itacademy.secondtask.model.Car;
import java.util.ArrayList;
import java.util.List;

public class FindCars {
    public static Car[] findCarsByPriceService(Car[] cars, double startPrice, double endPrice) {
        List<Car> filteredByPrice = new ArrayList<>();
        for (Car car : cars) {
            if ((car.getCarPrice() >= startPrice) && (car.getCarPrice() <= endPrice)) {
                filteredByPrice.add(car);
            }
        }
        return filteredByPrice.toArray(new Car[0]);

    }
    public static Car[] findCarsInYearsService(Car[] cars, int startYear, int endYear) {
        List<Car> filteredByYearCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCarModelYear() >= startYear && car.getCarModelYear() <= endYear) {
                filteredByYearCars.add(car);
            }
        }
        return filteredByYearCars.toArray(new Car[0]);

    }
}