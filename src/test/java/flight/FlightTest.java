package flight;

import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;
import staff.CabinCrewMember;
import staff.Pilot;
import staff.RankType;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember snrCrewMember;
    CabinCrewMember attendant1;
    CabinCrewMember attendant2;
    Passenger passenger;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight(pilot, plane, "OCA815", "Lost", "LAX", "14:00"  );
        pilot = new Pilot("Desmond", RankType.Captain, "LI123");
        plane = new Plane(PlaneType.BOEING777);
        snrCrewMember = new CabinCrewMember("Kate", RankType.SeniorCrew);
        attendant1 = new CabinCrewMember("Charlie", RankType.Crew);
        attendant2 = new CabinCrewMember("Hurley", RankType.Crew);
        flight.addCrew(snrCrewMember);
        flight.addCrew(attendant1);
        flight.addCrew(attendant2);
    }

    @Test
    public void hasFlightNum(){
        assertEquals("OCA815", flight.getFlightNum());
    }

    @Test
    public void hasDestination(){
        assertEquals("Lost", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("LAX", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("14:00", flight.getDepartureTime());
    }

    @Test
    public void canCheckCrewList(){
        assertEquals(3, flight.checkCrewList());
    }

    @Test
    public void
}
