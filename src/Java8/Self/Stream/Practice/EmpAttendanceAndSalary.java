package Java8.Self.Stream.Practice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpAttendanceAndSalary {

    static class Employee{
        int id;
        String name;
        double salary;
        String deportment;
        int daysPresent;

        public Employee(int id, String name, double salary, String deportment, int daysPresent) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.deportment = deportment;
            this.daysPresent = daysPresent;
        }

        public int getDaysPresent() {
            return daysPresent;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", deportment='" + deportment + '\'' +
                    ", daysPresent=" + daysPresent +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Employee> emp = List.of(
                new Employee(1, "Aman", 20000, "Java", 25),
                new Employee(2, "Aakash", 30000, "HTML", 30),
                new Employee(3, "Akshay Kumar", 18000, "Collection" , 19),
                new Employee(4, "Shhabaz", 28000, "SQL", 30),
                new Employee(5, "Sri", 26000, "JavaScript", 21)
        );

        System.out.println("Student with Bonus & sorted (Desc):");
        emp.stream()
                .filter(s -> s.daysPresent > 20)
                .map(s -> new Employee(
                        s.id,
                        s.name,
                        s.salary + (s.salary * 0.10),
                        s.deportment,
                        s.daysPresent
                        )
                )
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(s ->
                        System.out.println(s.name + " -> " + s.salary)
                );

        System.out.println("\nDepartment-wise Total Salary:");

        emp.stream()
                .collect(Collectors.groupingBy(
                        e -> e.deportment,
                        Collectors.summingDouble(e -> e.salary)
                ))
                .forEach((dept, total) ->
                        System.out.println(dept + " : " + total)
                );

    }
}
