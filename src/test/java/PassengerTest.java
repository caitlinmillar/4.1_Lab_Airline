import Enums.Destination;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {
    Flight flight;
    Passenger passenger;
    Passenger John;
    Passenger Ellie;

    @BeforeEach
    public void setUp(){
        flight = new Flight(9082, Destination.NEWYORK);
        passenger = new Passenger();
        flight.addPassenger(John = new Passenger());
        flight.addPassenger(Ellie = new Passenger());
    }

    @Test
    void canBookFlight() {
        flight.addPassenger(Ellie);
        assertEquals(3, flight.countPassengers());
    }

//
//    @Test
//    void canCancelFlight() {
//        flight.removePassenger(Ellie);
//        assertEquals(3, flight.countPassengers());
//    }

    // Stack overflow error
}
