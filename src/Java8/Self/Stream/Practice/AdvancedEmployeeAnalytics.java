package Java8.Self.Stream.Practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedEmployeeAnalytics {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Aman", 60000, "IT", "Delhi"),
                new Employee(2, "Rohit", 45000, "HR", "Mumbai"),
                new Employee(3, "Neha", 75000, "IT", "Delhi"),
                new Employee(4, "Pooja", 50000, "Sales", "Pune"),
                new Employee(5, "Karan", 42000, "HR", "Delhi"),
                new Employee(6, "Sneha", 68000, "IT", "Mumbai"),
                new Employee(7, "Arjun", 55000, "Sales", "Delhi"),
                new Employee(8, "Meera", 47000, "HR", "Pune")
        );

        // TASK 1: Department + City Wise Grouping
        System.out.println("\n--- Department + City Wise Grouping ---");

        Map<String, Map<String, List<Employee>>> deptCityGroup =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.groupingBy(Employee::getCity)
                        ));

        deptCityGroup.forEach((dept, cityMap) -> {
            System.out.println(dept);
            cityMap.forEach((city, empList) -> {
                System.out.println("   " + city + " -> " + empList);
            });
        });

        // TASK 2: Department Wise Average Salary (Tumne ye already kiya tha)
        System.out.println("\n--- Department Wise Average Salary ---");

        Map<String, Double> map = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        map.forEach((x, y) ->
                System.out.println(x + " -> " + y)
        );
        //  TASK 3: Department Wise Highest Salary Employee
        System.out.println("\n--- Department Wise Highest Salary Employee ---");

        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(
                                Comparator.comparing(Employee::getSalary)
                        )
                ))
                .forEach((dept, empOpt) ->
                        System.out.println(dept + " -> " + empOpt.get())
                );

        // TASK 4: Employees Having Salary Greater Than Overall Average
        System.out.println("\n--- Employees With Salary Greater Than Overall Average ---");

        double overallAvg =
                employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .orElse(0);

        System.out.println("Overall Average Salary: " + overallAvg);

        employees.stream()
                .filter(e -> e.getSalary() > overallAvg)
                .forEach(System.out::println);
    }

    static class Employee {
        int id;
        String name;
        double salary;
        String department;
        String city;

        public Employee(int id, String name, double salary, String department, String city) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.department = department;
            this.city = city;
        }

        public double getSalary() {
            return salary;
        }

        public String getDepartment() {
            return department;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + salary + " " + department + " " + city;
        }
    }
}
