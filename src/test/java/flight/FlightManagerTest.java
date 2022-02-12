package flight;

import org.junit.Before;
import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;
import staff.Pilot;
import staff.RankType;

public class FlightManagerTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Pilot pilot;
    Plane plane;

    @Before
    public void before(){
        passenger1 = new Passenger ("Locke", 2);
        passenger2 = new Passenger ("Sayid", 4);
        pilot = new Pilot ("Amelia Earhart", RankType.Captain, "LI078");
        plane = new Plane (PlaneType.AIRBUSA330);
        flight = new Flight (pilot, plane, "OA124", "BAR", "NEW", "18:30" );
    }


}
