import java.util.ArrayList;

// ---------------- Interface ----------------
interface ElectricVehicle {
    void chargeBattery(); // abstract method

    default void ecoMode() { // default method
        System.out.println("Eco mode activated!");
    }

    static void evInfo() { // static method
        System.out.println("Electric vehicles are environment friendly.");
    }

    // Private helper (Java 9+)
    private void checkBatteryHealth() {
        System.out.println("Battery health is good.");
    }
}

// ---------------- Abstract Class ----------------
abstract class TransportUnit {
    protected String brand;
    protected String model;
    protected int speed;

    public TransportUnit(String brand, String model) { // constructor
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public abstract void move(); // abstract method

    public void showInfo() { // concrete method
        System.out.println("Brand: " + brand + ", Model: " + model + ", Speed: " + speed + " km/h");
    }

}

// ---------------- Subclasses ----------------
class SmartCar extends TransportUnit implements ElectricVehicle {
    private int batteryLevel;

    public SmartCar(String brand, String model, int batteryLevel) {
        super(brand, model); // constructor chaining
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void move() {
        speed = 60;
        System.out.println(brand + " Smart Car is moving at speed " + speed + " km/h");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(brand + " Smart Car battery charged to " + batteryLevel + "%");
    }

    @Override
    public void ecoMode() { // override default
        System.out.println(brand + " Smart Car Eco mode activated! Speed reduced for efficiency.");
    }
}

class SmartBike extends TransportUnit implements ElectricVehicle {
    private int batteryLevel;

    public SmartBike(String brand, String model, int batteryLevel) {
        super(brand, model); // access the abstract class constructure
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void move() {
        speed = 40;
        System.out.println(brand + " Smart Bike is moving at speed " + speed + " km/h");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(brand + " Smart Bike battery charged to " + batteryLevel + "%");
    }
}

// ---------------- Main Class ----------------
public class SmartVehicleApp {
    public static void main(String[] args) {

        ElectricVehicle.evInfo(); // static interface method

        System.out.println("\n---- TransportUnit Operations ----");

        ArrayList<TransportUnit> garage = new ArrayList<>();
        garage.add(new SmartCar("Tesla", "Model S", 50));
        garage.add(new SmartBike("Zero", "FX", 30));

        for (TransportUnit t : garage) {
            t.showInfo();
            t.move();
        }

        System.out.println("\n---- Electric Vehicle Operations ----");

        ElectricVehicle ev1 = new SmartCar("Nissan", "Leaf", 60);
        ElectricVehicle ev2 = new SmartBike("Yadea", "G5", 20);

        ev1.chargeBattery();
        ev1.ecoMode();

        ev2.chargeBattery();
        ev2.ecoMode();

        System.out.println("\n---- End of Simulation ----");
    }
}
