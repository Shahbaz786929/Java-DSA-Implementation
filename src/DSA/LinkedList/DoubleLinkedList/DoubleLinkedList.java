package DSA.LinkedList.DoubleLinkedList;

class Node {
    Node next;
    Object element;
    Node prev;

    public Node(Object element) {
        this.element = element;
    }

    public Node(Node next, Object element, Node prev) {
        this.next = next;
        this.element = element;
        this.prev = prev;
    }
}

public class DoubleLinkedList {
    Node head;
    int count;
    Node tail;

    public void add (Object element) {
        Node n = new Node(element);
        if (head == null) {
            head = n;
            count++;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
            curr.next = n;
            n.prev = curr;
            tail = n;
            count++;

    }

    public int size () {
        return count;
    }

    public boolean isEmpty () {
        return count == 0;
    }

    public void aaFirst(Object element) {
        Node n = new Node(element);
        n.next = head;
        head.prev = n;
        head = n;
        count++;
    }

    public void addLast(Object element) {
        Node n = new Node(element);
        tail.next = n;
        n.prev = tail;
        tail = n;
        count++;
    }

    public void addIndex (Object element, int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();

        Node n = new Node(element);

        if (index == 0){
            aaFirst(element);
            return;
        }

        if (index == size()){
            addLast(element);
            return;
        }

        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
            n.next = curr.next;
            n.prev = curr;
            curr.next.prev = n;
            curr.next = n;
            count++;
    }

    public void removeFirst () {

        if (head == null) {
            return;
        }

        head = head.next;
        head.prev = null;
        count--;
    }

    public void removeLast () {

        if (tail == null) return;
        tail = tail.prev;
        tail.next = null;
        count--;
    }

    public void remove (int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();

        if (index == 0){
            removeFirst();
            return;
        }

        if (index == size() - 1) {
            removeLast();
            return;
        }

        Node curr = head;
        for ( int i = 1; i < index; i++) {
            curr = curr.next;
        }
            curr.next.next.prev = curr;
            curr.next = curr.next.next;
            count--;
    }

    public void revDisplay () {
        Node curr = tail;
        while (curr != null) {
            System.out.println(curr.element + " -> ");
            curr = curr.prev;
        }
    }

    public void display () {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.element + " -> ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(10);
        list.add(20);
    //    list.display();

        list.aaFirst(5);
        list.addLast(30);
     //   list.display();

        list.removeLast();
        list.removeFirst();
        list.addIndex(15, 2);
        list.display();
        list.revDisplay();
    }
}
