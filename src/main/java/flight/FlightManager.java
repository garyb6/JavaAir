package flight;

import passenger.Passenger;
import plane.Plane;

public class FlightManager {

    public int calculateBaggageWeight(Plane plane, Passenger passenger) {
        double planeBagLimit = plane.getWeight(plane) * 0.5;
        double bagWeight = planeBagLimit / plane.getCapacity(plane);
        return (int) (bagWeight * passenger.getBags());

    }
}
