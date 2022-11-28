import Enums.Destination;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private int flightNumber;
    private List<Destination> destination;
    private ArrayList<Passenger> passenger;

    public Flight(int flightNumber, Destination destination) {
        this.flightNumber = flightNumber;
        this.destination = new ArrayList<>();
        this.passenger = new ArrayList<Passenger>();
    }



    public int countPassengers(){
        return passenger.size();
    }

    public void addPassenger(Passenger passenger){
        this.passenger.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.removePassenger(passenger);
    } //try?

    public int getFlightNumber() {return flightNumber;}

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public List<Destination> getDestination() {
        return destination;
    }

    public void setDestination(List<Destination> destination) {
        this.destination = destination;
    }



}
