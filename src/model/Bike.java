package model;

public class Bike implements Vehicle {

    private String id;
    private String brand;

    public Bike(String id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike [ID=" + id + ", Brand=" + brand + "]");
    }
}

