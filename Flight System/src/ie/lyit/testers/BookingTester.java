package ie.lyit.testers;
import java.util.ArrayList;
import ie.lyit.flight.Booking;
import ie.lyit.flight.Flight;
import ie.lyit.flight.Passenger;

public class BookingTester {

	public static void main(String[] args) {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p1 = new Passenger ();
	
		Flight outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
	
		passengers.add(p1);
	
		Booking bookingA = new Booking(outbound, inbound, passengers);
	
		Passenger p2 = new Passenger ();
	
		Flight Outbound2 = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound2 = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
	
		passengers.add(p2);
		Booking bookingB = new Booking(Outbound2, Inbound2, passengers);

		bookingA.toString();
	
		bookingA.findPassenger(p1);
	
		bookingA.calculatePrice();
	

	}
}





