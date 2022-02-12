package flight;

import org.junit.Before;
import passenger.Passenger;
import plane.Plane;
import staff.CabinCrewMember;
import staff.Pilot;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Passenger passenger;
    Plane plane;





    @Before
    public void before(){
        flight = new Flight();
    }
}
