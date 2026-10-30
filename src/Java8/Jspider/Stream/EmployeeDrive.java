package Java8.Jspider.Stream;

import java.util.List;
import java.util.*;

public class EmployeeDrive {

    static class Employee{
        String name;
        int age;
        char gender;

        public Employee(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ram", 29, 'm');
        Employee e2 = new Employee("Sai", 27, 'm');
        Employee e3 = new Employee("Harshiri" , 19, 'f');
        Employee e4 = new Employee("MavyaSri", 20, 'f');
        Employee e5 = new Employee("Jyo", 25, 'f');
        Employee e6 = new Employee("Venkat", 27, 'm');

        List<Employee> aslist = Arrays.asList(e1,e2,e3,e4,e5,e6);

        long count = aslist.stream()
                .filter(i -> i.gender == 'f')
                .count();
        System.out.println("Female count is :" + count);
        System.out.println("Male count is :" + (aslist.size() - count));
    }
}
