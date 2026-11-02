package CDAC.CustomLinkedList.DoublyLinkedList;

public class DoublyLinkedListimpl<E> implements DoublyLinkedListService<E> {

    static  class Node<E> {
        Node next;
        Node prev;
        E data;

        public Node(E data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int count = 0;

    @Override
    public void add(E data) {
        addLast(data);

    }

    @Override
    public void addFirst(E data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        count++;

    }

    @Override
    public void addLast(E data) {

        Node n = new Node(data);
        if(head == null) {
            head = tail = n;
        } else {
            Node curr = head;

            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = n;
            n.prev = curr;
            tail = n;
        }
        count++;

    }

    @Override
    public void addIndex(int index, E data) {

        if (index == 0) {
            addFirst(data);
        } else if (index == count) {
            addLast(data);
        }

        Node n = new Node(data);
        Node curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        n.prev = curr.prev;
        n.next = curr;

        curr.prev.next = n;
        curr.prev = n;

        count++;

    }

    @Override
    public void removeFirst() {

        if (head == null) {
            System.out.println("List is Empty...");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {

            head = head.next;
            head.prev = null;
        }
        count--;

    }

    @Override
    public void removeLast() {

        if (head == null) {
            System.out.println("List is Empty...");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {

            tail = tail.prev;
            tail.next = null;
        }

        count--;

    }

    @Override
    public void removeIndex(int index) {

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == count - 1) {
            removeLast();
            return;
        }

        Node<E> curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        count--;

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void display() {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("Null");

    }

    @Override
    public void displayReverse() {

        Node curr = tail;

        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.prev;
        }
        System.out.println("Null");
    }
}
