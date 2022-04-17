package cab_Invoicer;

import java.util.HashMap;
import java.util.Map;

import exception.InvoiceGeneratorException;

public class RideRepository {
	Map<String, Ride[]> userRides = new HashMap<>();

	// METHOD TO ADD RIDES FOR PARTICULAR USER

	public void addRideForUser(String userId, Ride[] rides) throws InvoiceGeneratorException {
		if (userRides.containsKey(userId))
			throw new InvoiceGeneratorException(InvoiceGeneratorException.ExceptionType.USER_ALREADY_EXISTS,
					"User ID Already Exists!!!");
		else
			userRides.put(userId, rides);
	}

	// METHOD TO GET RIDE DETAILS FOR PARTICULAR USER

	public Ride[] getRidesForUser(String userId) {
		return userRides.get(userId);
	}
}
