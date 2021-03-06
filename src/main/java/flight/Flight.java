package flight;

import passenger.Passenger;
import plane.Plane;
import staff.CabinCrewMember;
import staff.Pilot;

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
        return this.flightNum;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void addCrew(CabinCrewMember cabinCrewMember){
        this.crewList.add(cabinCrewMember);
    }

    public int checkCrewList(){
        return this.crewList.size();
    }


    public int passengerManifestoSize() {
        return this.passengerManifesto.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengerManifesto.add(passenger);
    }

    public int checkAvailableSeats(Plane plane) {
        return plane.type.capacity - this.passengerManifesto.size();
    }

    public void bookPassenger(Passenger passenger, Plane plane) {
        if (checkAvailableSeats(plane) > 0) this.passengerManifesto.add(passenger);
    }
}
