package flight;

import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;
import staff.Pilot;
import staff.RankType;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Passenger passenger1;
    Passenger passenger2;
    Pilot pilot;
    Flight flight;
    Plane plane;
    FlightManager flightManager;

    @Before
    public void before(){
        flightManager = new FlightManager();
        passenger1 = new Passenger ("Locke", 2);
        passenger2 = new Passenger ("Sayid", 4);
        pilot = new Pilot ("Amelia Earhart", RankType.Captain, "LI078");
        plane = new Plane (PlaneType.AIRBUSA330);
        flight = new Flight (pilot, plane, "OA124", "BAR", "NEW", "18:30" );
    }

    @Test
    public void canCalculateBaggageWeight(){
        assertEquals(20, flightManager.calculateBaggageWeight(plane, passenger1));
    }


}
