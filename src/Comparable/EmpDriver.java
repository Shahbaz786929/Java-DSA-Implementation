package Comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Emp {
    String name;
    int id;
    int age;

    public Emp(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

class SortByAge implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Emp e1 = (Emp) o1;
        Emp e2 = (Emp) o2;
        return e1.age - e2.age;
    }
}

class SortById implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Emp e1 = (Emp) o1;
        Emp e2 = (Emp) o2;
        return e1.id - e2.id;
    }
}

class SortByName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Emp e1 = (Emp) o1;
        Emp e2 = (Emp) o2;
        return e1.name.compareTo(e2.name);
    }
}

public class EmpDriver {

    public static Comparator get() {
        Scanner s = new Scanner(System.in);
        System.out.println("\n1. SortById\n2. SortByAge\n3. SortByName\n4. None");
        int n = s.nextInt();
        if (n == 1) {
            return new SortById();
        }
        else if (n == 2) {
            return new SortByAge();
        }
        else if (n == 3) {
            return new SortByName();
        }
        else {
            System.out.println("Invalid input");
            return null;
        }
    }

    public static void main(String[] args) {
        Emp e1 = new Emp("Ayvak", 0, 26);
        Emp e2 = new Emp("ram", 2, 29);
        Emp e3 = new Emp("tara", 4, 24);
        Emp e4 = new Emp("Nitish", 3, 21);
        Emp e5 = new Emp("Ahbus", 1, 23);

        Emp [] e = {e1, e2, e3, e4, e5};
        Arrays.sort(e, get());
        for (Emp n : e) {
            System.out.println(n);
        }
    }
}
