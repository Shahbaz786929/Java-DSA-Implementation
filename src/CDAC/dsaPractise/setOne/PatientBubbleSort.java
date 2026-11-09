package CDAC.dsaPractise.setOne;

public class PatientBubbleSort {

    public static void bubbleSort(Patient[] patients) {
        if (patients == null || patients.length <= 1) {
            return;
        }

        int n = patients.length;

        for (int i = 0; i< n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j< n - 1-i; j++) {
                if (patients[j] == null) {
                    if (patients[j + 1] != null ) {
                        Patient temp = patients[j];
                        patients[j] = patients[j + 1];
                        patients[j + 1] = temp;
                        swapped = true;
                    }
                    continue;
                }

                if (patients[j + 1] == null) {
                    continue;
                }
                int age1 = patients[j].getAge();
                int age2 = patients[j + 1].getAge();

                int id1 = patients[j].getId();
                int id2 = patients[j + 1].getId();

                if (age1 > age2 || (age1 == age2 && id1 > id2)) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        Patient[] ward = {
                new Patient(504, "Vinod", 42, "Orthopedics"),
                new Patient(501, "Shyam", 65, "Cardiology"),
                new Patient(502, "Ananya", 24, "General"),
                new Patient(505, "Deepak", 42, "Neurology"),
                new Patient(503, "Kavya", 18, "Pediatrics"),
                new Patient(500, "Rahul", 42, "Dermatology")
        };

        System.out.println("--- BEFORE BUBBLE SORT ---");

        for (Patient p : ward) {
            System.out.println(p);
        }

        bubbleSort(ward);

        System.out.println(
                "\n--- AFTER OPTIMIZED BUBBLE SORT (Age ASC, ID ASC) ---"
        );

        for (Patient p : ward) {
            System.out.println(p);
        }
    }
}
