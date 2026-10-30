package Java8.Self.Stream.Practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStreamTask {

   static class Student {
        int id;
        String name;
        double marks;
        String city;

       public Student(int id, String name, double marks, String city) {
           this.id = id;
           this.name = name;
           this.marks = marks;
           this.city = city;
       }

       public double getMarks() {
           return marks;
       }

       public String getCity() {
           return city;
       }

       @Override
       public String toString() {
           return "Student{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   ", marks=" + marks +
                   ", city='" + city + '\'' +
                   '}';
       }
   }
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(1, "Aman", 55, "Delhi"),
                new Student(2, "Rohit", 72, "Mumbai"),
                new Student(3, "Neha", 88, "Delhi"),
                new Student(4, "Pooja", 64, "Pune"),
                new Student(5, "Karan", 45, "Mumbai")
                );

        System.out.println("Student with Bonus & sorted (Desc):");
        students.stream()
                .filter( s -> s.marks > 60)
                .map(s -> new Student(
                        s.id,
                        s.name,
                        s.marks + (s.marks * 0.05),
                        s.city
                ))
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .forEach(s ->
                        System.out.println(s.name + " -> " + s.marks));

        System.out.println("\n city-wise Average Marks:");

        Map<String , Double> cityAvg =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getCity,
                                Collectors.averagingDouble(
                                        Student::getMarks
                                )
                           )
                        );

        cityAvg.forEach((city, avg) ->
        System.out.println(city + " : " + avg)
       );
    }
}
