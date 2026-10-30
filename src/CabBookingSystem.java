import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Driver {
    public int driverId;
    public String name;
    public double rating;
    public boolean isAvailability;

    public Driver (int driverId, String name, double rating, boolean isAvailability) {
        this.driverId = driverId;
        this.name = name;
        this.rating = rating;
        this.isAvailability = isAvailability;
    }

    public int getDriverId () { return driverId; }
    public  String getName () { return  name; }
    public double getRating () { return rating; }
    public boolean getIsAvailability () { return isAvailability;}
    public void setAvailability(boolean availability) { this.isAvailability = availability; }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + driverId +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", available=" + isAvailability +
                '}';
    }
}

abstract class Cab {
    protected String cabId;
    protected String cabType;
    protected double perKmRate;

    public Cab (String cabId, String cabType, double perKmRate) {
        this.cabId = cabId;
        this.cabType = cabType;
        this.perKmRate = perKmRate;
    }

    public  String getCabType() { return cabType; }
    public  double getPerKmRate () { return perKmRate; }

    @Override
    public String toString() {
        return  cabType + " Cab (Rate: " + perKmRate + " per km)";
    }
}

class MiniCab extends Cab {
    public MiniCab(String cabId){
        super(cabId, "Mini", 10.0);
    }
}

class SedanCab extends Cab {
    public SedanCab(String cabId){
        super(cabId, "Sedan", 15.0);
    }
}

class SuvCab extends Cab {
    public SuvCab(String cabId) {
        super(cabId, "Suv", 20.0);
    }
}

class CabFactory{
    public static Cab getCab(String cabId, String cabType) {
        switch (cabType.toLowerCase()) {
            case "mini": return new MiniCab(cabId);
            case "sedan": return new SedanCab(cabId);
            case "suv": return new SuvCab(cabId);
            default: throw new IllegalArgumentException("Invalid cab type");
        }

    }
}

interface Paymente {
    void pay(double amount);
}

class CashPayment implements Paymente {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " done in CASH.");
    }
}

class WalletPayment implements Paymente {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " done in Wallet.");
    }
}

class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

class Ride {
    private static int counter = 1;
    private int rideId;
    private String customerName;
    private String source;
    private String destination;
    private double distance;
    private double fare;
    private String status;
    private Driver driverAssigned;
    private Cab cab;

    public Ride(String customerName, String source, String destination, double distance, Cab cab, Driver driver) {
        this.rideId = counter++;
        this.customerName = customerName;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.cab = cab;
        this.driverAssigned = driver;
        this.fare = distance * cab.getPerKmRate();
        this.status = "REQUESTED";
    }

    public double getFare() { return fare; }
    public void setStatus(String status) { this.status = status; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Ride{" +
                "rideId=" + rideId +
                ", customer='" + customerName + '\'' +
                ", from='" + source + '\'' +
                ", to='" + destination + '\'' +
                ", distance=" + distance +
                "km, fare=" + fare +
                ", status='" + status + '\'' +
                ", driver=" + driverAssigned.getName() +
                ", cab=" + cab.getCabType() +
                '}';
    }
}

public class CabBookingSystem {
    private List<Driver> drivers = new ArrayList<>();
    private List<Ride> rideHistory = new ArrayList<>();

    public CabBookingSystem() {
        // Add sample drivers
        drivers.add(new Driver(1, "Rahul", 4.7, true));
        drivers.add(new Driver(2, "Amit", 4.3, true));
        drivers.add(new Driver(3, "Suresh", 4.8, true));
    }

    private Driver findAvailableDriver() throws NoDriverAvailableException {
        for (Driver d : drivers) {
            if (d.getIsAvailability()) {
                d.setAvailability(false);
                return d;
            }
        }
        throw new NoDriverAvailableException("No drivers available at the moment.");
    }

    public void bookRide(String customer, String source, String destination, double distance, String cabType, Paymente payment) {
        try {
            Driver driver = findAvailableDriver();
            Cab cab = CabFactory.getCab(cabType, UUID.randomUUID().toString());

            Ride ride = new Ride(customer, source, destination, distance, cab, driver);
            ride.setStatus("ONGOING");

            System.out.println("\n Ride Booked Successfully!");
            System.out.println(ride);

            payment.pay(ride.getFare());

            ride.setStatus("COMPLETED");
            System.out.println(" Ride Completed: " + ride);

            rideHistory.add(ride);

        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showRideHistory() {
        System.out.println("\n Ride History:");
        for (Ride r : rideHistory) {
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        CabBookingSystem system = new CabBookingSystem();

        system.bookRide("Shahbaz", "Bangalore", "Mysore", 150, "Mini", new WalletPayment());
        system.bookRide("Shahbaz", "Airport", "Whitefield", 40, "Sedan", new CashPayment());

        system.showRideHistory();
    }
}

