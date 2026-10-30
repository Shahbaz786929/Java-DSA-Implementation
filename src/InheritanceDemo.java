
// Parent Class
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting...");
    }

    public void stop() {
        System.out.println(brand + " vehicle is stopping...");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Child Class
class Car extends Vehicle {
    int doors;
    String fuelType; // Petrol, Diesel, Electric

    Car(String brand, int speed, int doors, String fuelType) {
        super(brand, speed); // Call Vehicle constructor
        this.doors = doors;
        this.fuelType = fuelType;
    }

    public void carInfo() {
        displayInfo();
        System.out.println("Number of Doors: " + doors);
        System.out.println("Fuel Type: " + fuelType);
    }

    // Overriding start() method
    @Override
    public void start() {
        if (fuelType.equalsIgnoreCase("Electric")) {
            System.out.println(brand + " car is starting silently (Electric Power).");
        } else {
            System.out.println(brand + " car is starting with " + fuelType + " engine.");
        }
    }
}

// Specific BMW class (special Car)
class BMW extends Car {
    boolean sunroof;
    boolean autoPilot;

    BMW(int speed, String fuelType, boolean sunroof, boolean autoPilot) {
        super("BMW", speed, 4, fuelType); // BMW always 4-door
        this.sunroof = sunroof;
        this.autoPilot = autoPilot;
    }

    public void bmwFeatures() {
        carInfo();
        System.out.println("Sunroof: " + (sunroof ? "Available" : "Not Available"));
        System.out.println("AutoPilot: " + (autoPilot ? "Enabled" : "Disabled"));
    }

    // Overriding start for BMW
    @Override
    public void start() {
        System.out.println("BMW with " + fuelType + " engine is starting in luxury mode...");
    }
}

// Main Class
public class InheritanceDemo {
    public static void main(String[] args) {

        // Normal Vehicle
        Vehicle v1 = new Vehicle("Generic", 80);
        v1.start();
        v1.displayInfo();
        v1.stop();

        System.out.println("---------------------------");

        // Normal Car
        Car c1 = new Car("Toyota", 180, 4, "Petrol");
        c1.start();   // overridden method
        c1.carInfo();
        c1.stop();

        System.out.println("---------------------------");

        // Electric Car
        Car c2 = new Car("Tesla", 200, 4, "Electric");
        c2.start();
        c2.carInfo();
        c2.stop();

        System.out.println("---------------------------");

        // BMW Car
        BMW b1 = new BMW(250, "Diesel", true, true);
        b1.start();       // BMW specific start
        b1.bmwFeatures(); // BMW extra features
        b1.stop();
    }
}
