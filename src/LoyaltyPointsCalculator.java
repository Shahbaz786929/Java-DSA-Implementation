import java.util.Scanner;

public class LoyaltyPointsCalculator {

    public static boolean isValidTier(String tier) {
        if (tier == null) return false;

        String t = tier.trim().toUpperCase();
        return t.equals("GOLD") || t.equals("SILVER") || t.equals("REGULAR");
    }

    public static int calculatePoints(String mst, double ts) {

        if (ts < 100) {
            return 0;
        }

        int points = 0;

        switch (mst.toUpperCase()) {

            case "GOLD":
                points = (int) (ts / 100) * 10;
                if (ts > 500) {
                    points += 50;
                }
                break;

            case "SILVER":
                points = (int) (ts / 100) * 5;
                if (ts > 500) {
                    points += 20;
                }
                break;

            case "REGULAR":
                points = (int) (ts / 100) * 2;
                break;
        }

        return points;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Membership Tier (Gold/Silver/Regular): ");
        String tier = sc.nextLine();

        if (!isValidTier(tier)) {
            System.out.println("Invalid Membership Tier. Program Terminated.");
            sc.close();
            return;
        }

        System.out.print("Enter Total Amount Spent: ");
        double spent = sc.nextDouble();

        int points = calculatePoints(tier, spent);

        System.out.println("Loyalty Points Earned: " + points);

        sc.close();
    }
}
