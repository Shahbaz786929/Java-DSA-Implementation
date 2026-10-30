package Java8.Self.Stream.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PaidHighestSal {
   static class Employee {
        int id;
        String name;
        String dep;
        int sal;

        Employee(int id, String name, String dep, int sal) {
            this.id = id;
            this.name = name;
            this.dep = dep;
            this.sal = sal;
        }
    }

    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(1, "Amit", "IT", 50000),
                new Employee(2, "Rahul", "HR", 40000),
                new Employee(3, "Neha", "IT", 60000),
                new Employee(4, "Priya", "IT", 60000),
                new Employee(5, "Suman", "Finance", 45000),
                new Employee(6, "Karan", "HR", 55000)
        );

        String highPaidSal = employee.stream()
                .filter(e -> e.dep.equals("HR"))
                .max(Comparator.comparingInt(e -> e.sal))
                .map(e -> e.name)
                .orElse("No HR Employee found");
        System.out.println("Highest Paid HR Employee : " + highPaidSal);
    }
}
