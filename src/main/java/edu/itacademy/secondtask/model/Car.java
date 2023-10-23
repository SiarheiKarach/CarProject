package edu.itacademy.secondtask.model;


public class Car {
    private int carId;
    private CarBrand brand;
    private CarModel model;
    private int modelYear;
    private double price;
    private String registrationNumber;

    public Car() {
    }

    public Car(int carId, CarBrand brand, CarModel model, int modelYear, double price, String registrationNumber) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand carBrand) {
        this.brand = carBrand;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel carModel) {
        this.model = carModel;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(carId);
        sb.append(", brand=").append(model.getBrand());
        sb.append(", model=").append(model.getModelName());
        sb.append(", modelYear=").append(modelYear);
        sb.append(", price=").append(Math.round(price));
        sb.append(", registrationNumber=").append(registrationNumber);
        sb.append('}');
        return sb.toString();
    }


}