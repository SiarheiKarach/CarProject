package edu.itacademy.secondtask.service;

import edu.itacademy.secondtask.model.Car;
import java.util.ArrayList;
import java.util.List;

public class SearchCars {
    public  Car[] searchCarsByPriceService(Car[] cars, double startPrice, double endPrice) {
        List<Car> filteredByPrice = new ArrayList<>();
        for (Car car : cars) {
            if ((car.getPrice() >= startPrice) && (car.getPrice() <= endPrice)) {
                filteredByPrice.add(car);
            }
        }
        return filteredByPrice.toArray(new Car[0]);

    }
    public  Car[] searchCarsInYearsService(Car[] cars, int startYear, int endYear) {
        List<Car> filteredByYearCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModelYear() >= startYear && car.getModelYear() <= endYear) {
                filteredByYearCars.add(car);
            }
        }
        return filteredByYearCars.toArray(new Car[0]);

    }
}