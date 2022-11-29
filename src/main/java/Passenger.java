
import java.util.ArrayList;
import java.util.Random;

public class Passenger {

    private String name;
    private int contact;
    private int id;
    private ArrayList<Flight> flight;

    public Passenger(){
        Random passengerID = new Random();
        this.contact = contact;
        this.id = passengerID.nextInt(4000, 9000);
    }

    public ArrayList<Flight> getFlight() {
        return flight;
    }

    public void setFlight(ArrayList<Flight> flight) {
        this.flight = flight;
    }

    public void bookFlight(Flight flight){
        this.flight.add(flight);
    }

    public void cancelFlight(Flight flight){
        this.flight.remove(flight);
    }

    public String getName(String name) {
        return name;
    }

}








    //bookFlight()
    //cancelFlight()


        
