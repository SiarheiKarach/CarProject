package edu.itacademy.secondtask.model;

public enum CarModel {
    SKODA_OCTAVIA(CarBrand.SKODA, "Octavia"),
    FORD_MONDEO(CarBrand.FORD, "Mondeo"),
    SKODA_KODIAQ(CarBrand.SKODA,"Kodiaq"),
    SKODA_SUPERB(CarBrand.SKODA, "Superb"),
    VOLKSWAGEN_PASSAT(CarBrand.VW, "Passat"),
    VOLKSWAGEN_GOLF(CarBrand.VW, "Golf"),
    VOLKSWAGEN_TURAN(CarBrand.VW, "Turan"),
    SEAT_LEON(CarBrand.SEAT, "Leon"),
    SEAT_IBIZA(CarBrand.SEAT, "Ibiza"),
    AUDI_100(CarBrand.AUDI, "100"),
    PEUGEOT_508(CarBrand.PEUGEOUT, "508"),
    BMW_320(CarBrand.BMW, "320");

    private final CarBrand brand;
    private final String modelName;

    CarModel(CarBrand brand, String modelName) {
        this.brand = brand;
        this.modelName = modelName;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }
}