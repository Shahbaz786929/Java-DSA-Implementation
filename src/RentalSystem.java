import java.util.Scanner;

interface VehicleRent{
    double rent(int days);
    void returnVehicle();
}
abstract class AbstractVehicle implements VehicleRent {
    protected String vehicleNumber;
    protected String brand;
    protected double rentalRate;
    protected boolean isAvailable;

    public AbstractVehicle (String vehicleNumber, String brand, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentalRate = rentalRate;
        this.isAvailable = true;
    }

    public void markAvailable() {
        isAvailable = true;
    }

    public void markUnAvailable () {
        isAvailable = false;
    }
    @Override
    public void returnVehicle() {
        markAvailable();
        System.out.println(brand + " (" + vehicleNumber + ") returned and is now available.");
    }
    @Override
    public abstract double rent(int days);
}

class Car1 extends AbstractVehicle {
    private boolean hasGPS;

    public Car1(String vehicleNumber, String brand, double rentalRate, boolean hasGPS) {
        super(vehicleNumber, brand, rentalRate);
        this.hasGPS = hasGPS;
    }

    @Override
    public double rent(int days) {
        if (!isAvailable) {
            System.out.println("Car " + vehicleNumber + " is not available!");
            return 0;
        }
        markUnAvailable();
        double cost = rentalRate * days;
        if (days > 5) cost *= 0.9; // 10% discount
        if (hasGPS) cost += 100 * days; // GPS extra
        System.out.println("Car rented for " + days + " days. Total cost: " + cost);
        return cost;
    }
}

class Bike extends AbstractVehicle {

    private boolean hasHelmet;
    public Bike(String vehicleNumber, String brand, double rentalRate, boolean hasHelmet) {
        super(vehicleNumber, brand, rentalRate);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double rent(int days) {
        if (!isAvailable) {
            System.out.println("Bike " + vehicleNumber + " is not available!");
            return 0;
        }
        markUnAvailable();
        double cost = rentalRate * days;
        if (days > 3) cost *= 0.95; // 5% discount
        if (hasHelmet) cost += 20 * days; // Helmet extra
        System.out.println("Bike rented for " + days + "days. Total cost: " + cost);
        return cost;
    }
}

class Bus extends AbstractVehicle {
    private int seatCapacity;

    public Bus(String vehicleNumber, String brand, double rentalRate, int seatCapacity) {
        super(vehicleNumber, brand, rentalRate);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public double rent(int days) {
        if (!isAvailable) {
            System.out.println("Bus " + vehicleNumber + " is not available!");
            return 0;
        }
        markUnAvailable();
        double cost = rentalRate * days;
        System.out.println("Bus rented for " + days + " days with seat capacity " + seatCapacity + ". Total cost: " + cost);
        return cost;
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleRent vehicle = null;

        System.out.println("Select your Vehicle choice:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Bus");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter vehicle number: ");
        String number = sc.nextLine();

        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter rental rate per day: ");
        double rate = sc.nextDouble();

        switch(choice) {
            case 1: // Car
                System.out.print("Do you want GPS? ( (if yes select (true). other wise select (false) ): ");
                boolean gps = sc.nextBoolean();
                vehicle = new Car1(number, brand, rate, gps);
                break;
            case 2: // Bike
                System.out.print("Do you want Helmet? ( (if yes select (true). other wise select (false) ) ");
                boolean helmet = sc.nextBoolean();
                vehicle = new Bike(number, brand, rate, helmet);
                break;
            case 3: // Bus
                System.out.print("Enter seat capacity: ");
                int seats = sc.nextInt();
                vehicle = new Bus(number, brand, rate, seats);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        System.out.print("Enter number of days to rent: ");
        int days = sc.nextInt();

        vehicle.rent(days);

        System.out.println("\nReturning the vehicle...");
        vehicle.returnVehicle();

        sc.close();
    }
}
