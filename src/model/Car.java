package model;

public class Car implements Vehicle {

    private String id;
    private String brand;

    public Car(String id, String brand) {
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
        System.out.println("Car [ID=" + id + ", Brand=" + brand + "]");
    }
}

