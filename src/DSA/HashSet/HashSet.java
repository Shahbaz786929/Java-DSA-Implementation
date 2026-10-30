package DSA.HashSet;

public class HashSet {

    class Node {
        Object element;
        Node next;

        public Node(Object element) {
            this.element = element;
        }

        public Node(Object element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    
    Node [] a = new Node[10];
    int count =  0;
    boolean flag = true;

    public boolean add (Object element) {
        Node n =  new Node(element);
        int index = Math.abs(element.hashCode() % a.length); // Hashing
        if (a[index] == null){
            a[index] = n;
            count++;
            return flag;
        }
        Node curr = a[index];
        Node prev = null;
        while (curr != null) {
            if (curr.element.equals(element)) {
                flag = false;
                return false;
            }
            prev = curr;
            curr = curr.next;
        }
        prev.next = n;
        count++;
        return flag;
    }

    public int size() {
        return count;
    }

    public void display () {
        for (int i = 1; i < a.length; i++) {
            Node curr = a[i];
            while (curr != null) {
                System.out.println(curr.element);
                curr = curr.next;
            }
        }
    }

    public boolean contains(Object element) {
        int index = Math.abs(element.hashCode() % a.length);
        Node curr = a[index];
        while (curr != null) {
            if (curr.element.equals(element)) return true;
            curr = curr.next;
        }
        return false;
    }

    public boolean remove (Object element) {
        int index = Math.abs(element.hashCode() % a.length);
        Node curr = a[index];
        Node prev = null;
        while (curr != null) {
            if (curr.element.equals(element)) {
                if (prev == null) {
                    a[index] = a[index].next;
                    count--;
                    return true;
                }
                prev.next = prev.next.next;
                count--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
        set.add(60);

        System.out.println(set.size());
        set.display();
        set.contains(20);
        set.remove(60);
        set.display();

    }
}
