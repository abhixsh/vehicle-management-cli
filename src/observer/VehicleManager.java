package observer;

import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager implements Subject {

    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        notifyObservers("Vehicle added: " + vehicle.getId());
    }

    public void removeVehicle(String id) {
        vehicles.removeIf(v -> v.getId().equals(id));
        notifyObservers("Vehicle removed: " + id);
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
        vehicles.forEach(Vehicle::displayInfo);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

