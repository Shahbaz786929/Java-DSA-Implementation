import java.util.Scanner;

public class SmartTrafficLightSystem {

    public static boolean isValidSignal(String signal) {
        if (signal == null) return false;

        String s = signal.trim().toUpperCase();
        return s.equals("RED") || s.equals("YELLOW") || s.equals("GREEN");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Current Signal (RED / YELLOW / GREEN): ");
        String signalInput = scanner.nextLine();

        if (!isValidSignal(signalInput)) {
            System.out.println("Invalid Signal. Program Terminated.");
            scanner.close();
            return;
        }

        String signal = signalInput.trim().toUpperCase();

        if (signal.equals("GREEN")) {
            System.out.println("Traffic Instruction: GO");
            scanner.close();
            return;
        }

        System.out.print("Is an Emergency Vehicle Approaching? (true / false): ");
        boolean isEmergency = scanner.nextBoolean();

        if (isEmergency) {
            System.out.println("Traffic Instruction: IMMEDIATE GREEN");
        } else if (signal.equals("RED")) {
            System.out.println("Traffic Instruction: STOP");
        } else {
            System.out.println("Traffic Instruction: PREPARE TO STOP");
        }

        scanner.close();
    }
}
