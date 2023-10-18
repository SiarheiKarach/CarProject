package edu.itacademy.secondtask.model;

public enum CarBrand {
    SKODA("Skoda"),
    VW("Volkswagen"),
    SEAT("Seat"),
    INFINITY("Infinity"),
    PORCHE("Porche"),
    PEUGEOUT("Peugeot"),
    RENAULT("Renault"),
    BMW("BMW"),
    AUDI("Audi"),
    FORD( "Ford" );

    private final String brandName;

    CarBrand(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}