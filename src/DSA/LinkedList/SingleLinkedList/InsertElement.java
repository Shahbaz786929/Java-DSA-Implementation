package DSA.LinkedList.SingleLinkedList;
/*
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

public class InsertElement {
    Node head = null;
    int count = 0;
    Node tail = null;

    public void addfirst (Object element) {
        Node n = new Node(element);
        n.next = head;
        head = n;
        count++;
    }

    public void add(Object element) {
        Node n = new Node(element);

        if (head == null) {
            head = n;
            tail = n;
            count++;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = n;
        tail = n;
        count++;
    }


    public void addLast(Object element) {
        Node n = new Node(element);
        n.next = null;
        head.next =n;
        count++;
    }

    public boolean isEmpty () {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void display () {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.element);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        InsertElement list = new InsertElement();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.addLast(60);
        list.addfirst(5);
        list.display();
    }
}


 */
// ChatGPT code
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

public class InsertElement {
    Node head = null;
    Node tail = null;
    int count = 0;

    public void addfirst(Object element) {
        Node n = new Node(element);
        n.next = head;
        head = n;
        if (tail == null) tail = n; // when first node added
        count++;
    }

    public void add(Object element) {
        Node n = new Node(element);

        if (head == null) {
            head = n;
            tail = n;
            count++;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = n;
        tail = n;
        count++;
    }

    public void addLast(Object element) {
        Node n = new Node(element);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        count++;
    }

    public void get(int index) {
        if (index < 0 || index > size())
            throw new ArrayIndexOutOfBoundsException();

        Node curr = head;
        for (int i = 1; i < index; i++){
            curr = curr.next;
        }

    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.element + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertElement list = new InsertElement();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.addLast(60);
        list.addfirst(5);
        list.display();
    }
}


