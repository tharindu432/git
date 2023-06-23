 public class Plane {

        String airPlaneName;
        String airPlaneType;
        double maximumSpeed;

        // Constructor to initialize the instance variables
        public Plane(String PlaneName, String PlaneType, double maxSpeed) {
            this.airPlaneName = PlaneName;
            this.airPlaneType = PlaneType;
            this.maximumSpeed = maxSpeed;
        }

        // Method to print the details of the plane
        public void printPlaneDetails() {
            System.out.println("Airplane Name: " + this.airPlaneName);
            System.out.println("Airplane Type: " + this.airPlaneType);
            System.out.println("Maximum Speed: " + this.maximumSpeed);

        }
    }

// Define the Flight class

// Define the Driver class


