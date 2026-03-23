package factory;

import model.Bike;
import model.Vehicle;

public class BikeFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle(String id, String brand) {
        return new Bike(id, brand);
    }
}

