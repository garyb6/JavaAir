package flight;

import passenger.Passenger;
import plane.Plane;
import staff.CabinCrewMember;
import staff.Pilot;
import staff.RankType;

import java.util.ArrayList;

public class Flight {

    Pilot pilot;
    Plane plane;
    ArrayList<Passenger> passengerManifesto;
    ArrayList<CabinCrewMember> crewList;
    String flightNum;
    String destination;
    String departureAirport;
    String departureTime;


    public Flight(Pilot pilot, Plane plane, String flightNum, String destination, String departureAirport, String departureTime  ) {
        this.pilot = pilot;
        this.crewList = new ArrayList<CabinCrewMember>();
        this.passengerManifesto = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
