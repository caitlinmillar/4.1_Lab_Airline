import Enums.Destination;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Enums.Destination.PARIS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;


    @BeforeEach
    public void setUp() {
        flight = new Flight(5782, Destination.PARIS);
        passenger1 = new Passenger();

    }

    @Test
    public void canGetFlightNumber() {
        assertThat(flight.getFlightNumber()).isEqualTo(5782);
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.countPassengers());
    }


}
