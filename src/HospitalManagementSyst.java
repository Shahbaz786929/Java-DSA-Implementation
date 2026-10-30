import java.util.ArrayList;
import java.util.Scanner;

class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
    }
}

class Docter extends Person{

    String specialization;
    double salary;

    public Docter(int id, String name, int age, String specialization, double salary){
        super(id,name,age);
        this.specialization = specialization;
        this.salary = salary;
    }

    @Override
    public void display(){
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age + " | Specialization: " + specialization + " | Salary: " + salary);
    }
}

class Patient extends Person {

    String disease;
    String admissionDate;

    public Patient(int id, String name, int age,String disease, String admissionDate) {
        super(id, name, age);
        this.disease = disease;
        this.admissionDate = admissionDate;
    }

    @Override
    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age + " | Disease: " + disease + " | Admission Date: " + admissionDate);
    }
}
public class HospitalManagementSyst {
    public static void main(String[] args) {
        ArrayList<Docter> docters = new ArrayList<>();
        ArrayList<Patient> patients= new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Docter:");
            System.out.println("2. Add Patient:");
            System.out.println("3. Show All Docter:");
            System.out.println("4. Show All Patients:");
            System.out.println("5. Exit:");
            System.out.println("Enter your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Your id :");
                    int did = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your Name :");
                    String dname = sc.nextLine();
                    System.out.println("Enter Your Age :");
                    int dage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your specialization :");
                    String dspe = sc.nextLine();
                    System.out.println("Enter Your Salary :");
                    double dsal = sc.nextDouble();
                    docters.add(new Docter(did, dname, dage, dspe, dsal));
                    System.out.println("Docter Successfully Added :");
                    break;

                case 2:
                    System.out.println("Enter Your Id :");
                    int pid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Your Name :");
                    String pname = sc.nextLine();
                    System.out.println("Enter Your Age :");
                    int page = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Your disease :");
                    String pdis = sc.nextLine();
                    System.out.println("Enter Admission Date :");
                    String paddm = sc.nextLine();
                    patients.add(new Patient(pid, pname, page, pdis, paddm));
                    System.out.println(" Patients Successfully Added :");
                    break;

                case 3:
                    if (docters.isEmpty()) {
                        System.out.println("Docter is not available :");
                    }
                    else {
                        for (Docter d : docters){
                            d.display();
                        }
                    }
                    break;

                case 4:
                    if (patients.isEmpty()) {
                        System.out.println(" Patient not found :");
                    }
                    else {
                        for (Patient p : patients) {
                            p.display();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting....... Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!!!!!");
            }
        }

    }
}
