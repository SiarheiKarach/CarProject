package edu.itacademy.secondtask.main;

import edu.itacademy.secondtask.creator.CreateCarsFactory;
import edu.itacademy.secondtask.model.Car;
import edu.itacademy.secondtask.service.FindCars;


public class CarProject {
    public static void main(String[] args) {
        Car[] cars = CreateCarsFactory.createCars(5);
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("__________");

        Car[] filteredByYearCars = FindCars.findCarsInYearsService(cars, 1992, 2023);
        for (Car filteredByYearCar : filteredByYearCars) {
            System.out.println(filteredByYearCar);
        }
        System.out.println("__________");

        Car[] filteredByPrice = FindCars.findCarsByPriceService(cars, 5000, 15000);
        for (Car car : filteredByPrice) {
            System.out.println(car);
        }
    }



    }