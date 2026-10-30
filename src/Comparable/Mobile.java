package Comparable;

import java.lang.reflect.Array;
import java.util.Arrays;

class Mobile1 implements Comparable{
    String name;
    int ram;
    int rom;
    String color;

    public Mobile1(String name, int ram, int rom, String color) {
        this.name = name;
        this.ram = ram;
        this.rom = rom;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mobile1{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                ", color='" + color + '\'' +
                '}';
    }
    public int compareTo(Object o){
        Mobile1 m = (Mobile1) o;
        return this.color.compareTo(m.color);
    }
}

public class Mobile {
    public static void main(String[] args) {
        Mobile1 m1 = new Mobile1("Oppo",4, 4, "black");
        Mobile1 m2 = new Mobile1("vivo",8, 4, "white");
        Mobile1 m3 = new Mobile1("Sumsong",4, 8, "red");


        Mobile1 [] m = {m1,m2,m3};
        Arrays.sort(m);

        for (Mobile1 n: m)
            System.out.println(n);

    }
}
