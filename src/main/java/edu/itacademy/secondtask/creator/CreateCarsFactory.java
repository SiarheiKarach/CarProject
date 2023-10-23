package edu.itacademy.secondtask.creator;

import edu.itacademy.secondtask.model.CarBrand;
import edu.itacademy.secondtask.model.Car;
import edu.itacademy.secondtask.model.CarModel;
import java.util.Random;

public class CreateCarsFactory {
    public static Car[] createCars(int size) {
        Car[] cars = new Car[size];
        Random random = new Random();
        CarBrand[] carBrands = CarBrand.values();
        int brandBorder = carBrands.length;
        CarModel[] carModels = CarModel.values();
        int modelBorder = carModels.length;
        for (int i = 0; i < size; i++) {
            Car car = new Car();
            int idRandom = random.nextInt(1000000, 9999999);
            car.setCarId(idRandom);
            int brandRandom = random.nextInt(brandBorder);
            CarBrand currentCarBrand = carBrands[brandRandom];
            car.setBrand(currentCarBrand);
            int modelRandom = random.nextInt(modelBorder);
            CarModel currentCarModel = carModels[modelRandom];
            car.setModel(currentCarModel);
            int modelYearRandom = random.nextInt(1990,2023);
            car.setModelYear(modelYearRandom);
            double priceRandom = random.nextDouble(5000.00,15000.45);
            car.setPrice(priceRandom);
            int registrationNumberRandom = random.nextInt(100,999);
            String registrationNumberLetter = "BY";
            car.setRegistrationNumber(registrationNumberRandom+registrationNumberLetter+ registrationNumberRandom);
            cars[i] = car;
        }
        return cars;
    }
}