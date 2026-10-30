package Java8.Self.Stream.Practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

public class GroupingEmp {

    static class Emp {
        int id;
        String name;
        double salary;
        String city;
        String department;

        public Emp (int id, String name, double salary, String department, String city) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.department = department;
            this.city = city;
        }


        public double getSalary () {
            return salary;
        }

        public String getDepartment () {
            return department;
        }

        public String getCity () {
            return city;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", city='" + city + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Emp> emp = List.of(
                new Emp(1, "Aman", 60000, "IT", "Delhi"),
                new Emp(2, "Rohit", 45000, "HR", "Mumbai"),
                new Emp(3, "Neha", 75000, "IT", "Delhi"),
                new Emp(4, "Pooja", 50000, "Sales", "Pune"),
                new Emp(5, "Karan", 42000, "HR", "Delhi"),
                new Emp(6, "Sneha", 68000, "IT", "Mumbai"),
                new Emp(7, "Arjun", 55000, "Sales", "Delhi"),
                new Emp(8, "Meera", 47000, "HR", "Pune")
        );

        // TASK 1: Department + City Wise Grouping
        System.out.println("\n--- Department + City Wise Grouping ---");

        Map<String, Map<String, List<Emp>>> deptCityGroup =
                emp.stream()
                        .collect(Collectors.groupingBy(
                                Emp::getDepartment,
                                Collectors.groupingBy(Emp::getCity)
                        ));
                            deptCityGroup.forEach((dept, cityMap) -> {
                                System.out.println(dept);
                                cityMap.forEach((city, empList) -> {
                                    System.out.println("   " + city + " -> " + empList);
                                });
                            });

                            // TASK 2: Department Wise Average Salary (Tumne ye already kiya tha)
                            System.out.println("\n--- Department Wise Average Salary ---");

                            Map<String, Double> map = emp.stream()
                                    .collect(Collectors.groupingBy(
                                            Emp::getDepartment,
                                            Collectors.averagingDouble(Emp::getSalary)
                                    ));
                            map.forEach((x, y) ->
                                    System.out.println(x + " -> " + y)
                            );
                            //  TASK 3: Department Wise Highest Salary Employee
                            System.out.println("\n--- Department Wise Highest Salary Employee ---");

                            emp.stream()
                                    .collect(Collectors.groupingBy(
                                            Emp::getDepartment,
                                            Collectors.maxBy(
                                                    Comparator.comparing(Emp::getSalary)
                                            )
                                    ))
                                    .forEach((dept, empOpt) ->
                                            System.out.println(dept + " -> " + empOpt.get())
                                    );
                                    // TASK 4: Employees Having Salary Greater Than Overall Average
                                    System.out.println("\n--- Employees With Salary Greater Than Overall Average ---");

                                    double overallAvg =
                                            emp.stream()
                                                    .mapToDouble(Emp::getSalary)
                                                    .average()
                                                    .orElse(0);

                                    System.out.println("Overall Average Salary: " + overallAvg);

                                    emp.stream()
                                            .filter(e -> e.getSalary() > overallAvg)
                                            .forEach(System.out::println);
    }
}
