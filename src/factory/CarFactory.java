package factory;

import model.Car;
import model.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle(String id, String brand) {
        return new Car(id, brand);
    }
}

