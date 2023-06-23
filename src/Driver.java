// Define the Plane class
 class Driver {
    public static void main(String[] args) {
        // Create a new Plane object
        Plane plane = new Plane("Airbus A300B4", "Airbus A300", 876);

        // Create a new Flight object
        Flight flight = new Flight(123, "Colombo", "Paris", 8495.72);

        // Assign the plane to the flight
        flight.assignPlane(plane);

        // Print the flight details
        flight.printFlightDetails();

        flight.delayFlight(2);
        flight.printFlightDetails();
    }
}


