import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Management sm = new Management();

        while (true){
            System.out.println("\n1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Topper");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter number of subjects: ");
                    int n = sc.nextInt();
                    int [] marks = new int[n];
                    for (int i = 0; i < n; i++){
                        System.out.println("Enter marks for subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }
                    Student newStudent = new Student(id, name, marks);
                    sm.addStudent(newStudent);
                    break;

                case 2:
                    sm.showAllStudent();
                    break;

                case 3:
                    sm.showTopper();
                    break;

                case 4:
                    System.out.println("Exiting..... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
class Student{
    int id;
    String name;
    int [] marks;
    double average;

    public Student(int id, String name, int [] marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void calculateAverage() {
        int sum = 0;
        for (int m : marks){
            sum += m;
        }
        this.average = (double) sum / marks.length;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Average: " + average);
    }
}
class Management {
    ArrayList<Student> std = new ArrayList<>();

    public void addStudent(Student s){
        std.add(s);
        System.out.println("Student Added Successfully:");
    }

    public void showAllStudent(){
        if (std.isEmpty()){
            System.out.println("No student found.");
        }
        else {
            for (Student s : std){
                s.display();
            }
        }

    }

    public void showTopper() {
        if (std.isEmpty()) {
            System.out.println("No Student available.");
            return;
        }
        Student topper = std.get(0);
        for (Student s : std) {
            if (s.average > topper.average) {
                topper = s;
            }
        }
        System.out.println("Topper: " + topper.name + " with Average = " + topper.average);
    }
}