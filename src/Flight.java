public class Flight {

        int flightNumber;
        String departingAirport;
        String arrivingAirport;
        double routeDistance;
        Plane assignedPlane;
        double minimumHours;
        boolean isDelayed;

        // Constructor to initialize the instance variables
        public Flight(int flightNumber, String departingAirport, String arrivingAirport,
                      double routeDistance) {
            this.flightNumber = flightNumber;
            this.departingAirport = departingAirport;
            this.arrivingAirport = arrivingAirport;
            this.routeDistance = routeDistance;
            this.minimumHours = 0;
            this.isDelayed = false;
        }

        // Method to assign a plane to the flight and calculate minimum hours
        public void assignPlane( Plane plane) {
            this.assignedPlane = plane;
            this.minimumHours = this.routeDistance / plane.maximumSpeed;
        }

        // Method to delay the flight and update minimum hours
        public double delayFlight(double delayedHours) {
            this.minimumHours = this.minimumHours+delayedHours;
            this.isDelayed = true;
            return delayedHours;


        }




        // Method to print the details of the flight, including the plane details
        public void printFlightDetails() {

            System.out.println("Flight Number: " + this.flightNumber);
            System.out.println("Departing Airport: " + this.departingAirport);
            System.out.println("Arriving Airport: " + this.arrivingAirport);
            System.out.println("Route Distance: " + this.routeDistance);
            System.out.println("Assigned Plane: " + this.assignedPlane.airPlaneName);
            this.assignedPlane.printPlaneDetails();
            System.out.println("Minimum Hours: " + this.minimumHours);
            if (this.isDelayed) {
                double delayedHours = minimumHours - (routeDistance / assignedPlane.maximumSpeed);
                System.out.println("This flight is delayed by " + delayedHours + " hours.");
            } else {
                System.out.println("Flight is not delayed.");
            }
        }
    }






