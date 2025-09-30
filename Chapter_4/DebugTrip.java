public class DebugTrip {
    private String destination;
    private String departure;
    private String mode;
    
    
    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    
    public DebugTrip(String destination) {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);     }

        public DebugTrip(String destination, String departure) {
        this(destination, departure, DEFAULT_MODE); 
    }

    
    public DebugTrip(String destination, String departure, String mode) {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

        public String getDestination() {
        return destination;
    }

       public String getDepartureCity() {
        return departure;
    }

        public String getMode() {
        return mode;
    }

    
    public static void main(String[] args) {
        DebugTrip trip1 = new DebugTrip("New York");
        System.out.println("Trip 1:");
        System.out.println("Destination: " + trip1.getDestination());
        System.out.println("Departure City: " + trip1.getDepartureCity());
        System.out.println("Mode of Transportation: " + trip1.getMode());

        DebugTrip trip2 = new DebugTrip("Los Angeles", "Chicago");
        System.out.println("\nTrip 2:");
        System.out.println("Destination: " + trip2.getDestination());
        System.out.println("Departure City: " + trip2.getDepartureCity());
        System.out.println("Mode of Transportation: " + trip2.getMode());

        
        DebugTrip trip3 = new DebugTrip("Miami", "Houston", "plane");
        System.out.println("\nTrip 3:");
        System.out.println("Destination: " + trip3.getDestination());
        System.out.println("Departure City: " + trip3.getDepartureCity());
        System.out.println("Mode of Transportation: " + trip3.getMode());
    }
}
