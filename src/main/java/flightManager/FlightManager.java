package flightManager;

import passenger.Passenger;
import plane.Plane;

public class FlightManager {

    public double calculateBaggageWeight(Plane plane, Passenger passenger) {
        double planeBagWeight = (plane.type.weight * 0.5);
        double bagWeight = planeBagWeight / (plane.type.capacity);
        return passenger.getBags() * bagWeight;

    }
}
