package ie.lyit.flight;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookingTest {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	public void testBookingFlightFlightArrayListOfPassenger() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ();
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking bookingA = new Booking(Outbound, Inbound, passengers);
		
		assertNotNull(Outbound);
		assertNotNull(Inbound);
		assertNotNull(bookingA);
		assertNotNull(passengers);
		
	}

	@Test
	public void testToString() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ();
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking booking = new Booking(Outbound, Inbound, passengers);
		booking.toString();
	}

	@Test
	public void testFindPassenger() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ();
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking booking = new Booking(Outbound, Inbound, passengers);
		
		booking.findPassenger(p);
	}

	@Test
	public void testCalculatePrice() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ();
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking booking = new Booking(Outbound, Inbound, passengers);
		
		booking.calculatePrice();
	}

	@Test
	public void testSetInbound() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ();
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking booking = new Booking(Outbound, Inbound, passengers);
		booking.setInbound(Inbound, Inbound);
	}

	@Test
	public void testSetOutbound() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ();
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking booking = new Booking(Outbound, Inbound, passengers);
		booking.setInbound(Outbound, Inbound);
	}

	@Test
	public void testSetTotalPrice() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ();
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking booking = new Booking(Outbound, Inbound, passengers);
		booking.setTotalPrice(200.00);
	}

}
//Passenger p = new Passenger ();
