package service;

import factory.BikeFactory;
import factory.CarFactory;
import factory.VehicleFactory;
import model.Vehicle;
import observer.VehicleManager;

public class VehicleService {

    private VehicleManager vehicleManager;

    public VehicleService(VehicleManager vehicleManager) {
        this.vehicleManager = vehicleManager;
    }

    public void createVehicle(String type, String id, String brand) {
        VehicleFactory factory;

        if (type.equalsIgnoreCase("car")) {
            factory = new CarFactory();
        } else if (type.equalsIgnoreCase("bike")) {
            factory = new BikeFactory();
        } else {
            System.out.println("Invalid vehicle type.");
            return;
        }

        Vehicle vehicle = factory.createVehicle(id, brand);
        vehicleManager.addVehicle(vehicle);
    }
}
