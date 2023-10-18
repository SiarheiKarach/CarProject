package edu.itacademy.secondtask.model;


public class Car {
    private int carId;
    private CarBrand carBrand;
    private CarModel carModel;
    private int carModelYear;
    private double carPrice;
    private String carRegistrationNumber;

    public Car() {
    }

    public Car(int carId, CarBrand carBrand, CarModel carModel, int carModelYear, double CarPrice, String carRegistrationNumber) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carModelYear = carModelYear;
        this.carPrice = CarPrice;
        this.carRegistrationNumber = carRegistrationNumber;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public CarBrand getBrand() {
        return carBrand;
    }

    public void setBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public CarModel getModel() {
        return carModel;
    }

    public void setModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public int getCarModelYear() {
        return carModelYear;
    }

    public void setCarModelYear(int carModelYear) {
        this.carModelYear = carModelYear;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public void setCarRegistrationNumber(String carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(carId);
        sb.append(", brand=").append(carModel.getBrand());
        sb.append(", model=").append(carModel.getModelName());
        sb.append(", modelYear=").append(carModelYear);
        sb.append(", price=").append(Math.round(carPrice));
        sb.append(", registrationNumber=").append(carRegistrationNumber);
        sb.append('}');
        return sb.toString();
    }


}