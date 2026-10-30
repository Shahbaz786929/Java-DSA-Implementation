package PracProgram.DSA.LinkedList;

public class DoubleLinkedList {

    class Node {
        Object element;
        Node next;
        Node prev;

        Node(Object element){
            this.element = element;
        }
        public Node(Object element, Node next, Node prev){
            this.next = next;
            this.prev = prev;
            this.element = element;
        }
    }

    Node head;
    int count = 0;
    Node tail;

    public void add(Object element) {
        Node n = new Node(element);
        if (head == null) {
            head = n;
            count++;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = n;
        n.prev = curr;
        tail = n;
        count++;
        return;
    }

    public boolean isEmpty () {
        return count == 0;
    }

    public int size () {
        return count;
    }

    public void addFirst(Object element) {
        Node n = new Node(element);
        n.next = head;
        head.prev = n;
        head = n;
        count++;
    }

//    public void addLast (Object element) {
//        Node n = new Node(element);
//        tail.next = n;
//        n.prev = tail;
//        tail = n;
//        count++;
//    }

    public void addLast(Object element) {
        Node n = new Node(element);
        tail.next = n;
        n.prev = tail;
        tail = n;
        count++;
    }

    public void display () {
        if (count == 0) {
            System.out.println("List is Empty!!!!!");
            return;
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.element + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.add(20);
        list.addFirst(10);
        list.addLast(50);
        list.add(40);
        list.add(30);
        list.display();

    }
}
