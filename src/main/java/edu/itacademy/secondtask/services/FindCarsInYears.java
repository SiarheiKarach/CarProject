package edu.itacademy.secondtask.services;

import edu.itacademy.secondtask.model.Car;

import java.util.ArrayList;
import java.util.List;

public class FindCarsInYears {
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