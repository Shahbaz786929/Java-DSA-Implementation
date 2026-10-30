package DSA.ArraysList;

public class Implementation {
    Object [] o = new Object[10];
    int count = 0;

    public void add(Object element){
        if (count >= o.length)
            increase();
        o[count++] = element;
    }

    public void increase() {
        Object [] a = new Object[o.length + 5];
        for (int i = 0; i < o.length; i++)
            a[i] = o[i];
        o = a;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Object get(int index) {
        if (index < 0 || index > size())
            throw new ArrayIndexOutOfBoundsException();
        return  o[index];
    }

    public void set( Object element, int index) {
        if (index < 0 || index > size())
            throw new ArrayIndexOutOfBoundsException();
        o[index]  = element;
    }

    public void addIndex (Object element, int index) {
        if (count >= o.length)
            increase();
        if (index < 0 || index > size())
            throw new ArrayIndexOutOfBoundsException();
        for (int i = size(); i >index; i--)
            o[i] = o[i - 1];
        o[index] = element;
        count++;
    }

    public boolean contains( Object key){

        for (int i = 0; i < o.length; i++){
            if (o[i] == key) return true;
        }
        return false;
    }


    public void remove(int index) {
        if (index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();
        for (int i = index; i < size(); i++)
            o[i] = o[i + 1];
        o[size() - 1] = null;
        count--;
    }
    public void display() {
        for (int i = 0; i < size(); i++){
            System.out.print(get(i) + " -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Implementation a = new Implementation();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.display();

        //     a.remove(2);
        //    a.display();

        System.out.println(a.contains(10));
        System.out.println(a.contains(60));

    }
}

