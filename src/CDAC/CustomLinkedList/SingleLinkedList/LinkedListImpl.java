package CDAC.CustomLinkedList.SingleLinkedList;

public class LinkedListImpl <E> implements LinkedListService<E> {

    static class Node<E> {

        E data;
        Node next;

        public Node(E data) {
            this.data = data;
        }
    }

    Node head;
    int count = 0;

    @Override
    public void add(E data) {
       addLast(data);
    }

    @Override
    public void addFirst(E data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
        count++;
    }

    @Override
    public void addLast(E data) {
        Node n = new Node(data);

        if (head == null) {
            addFirst(data);
            return;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = n;
        }
        count++;

    }

    @Override
    public void addIndex(int index, E data) {

        Node n = new Node(data);

        if (index == 0) {
            addFirst(data);
            return;
        } else if (index == size()) {
            addLast(data);
            return;
        }

        Node curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        n.next = curr.next;
        curr.next = n;
        count++;
        return;

    }

    @Override
    public void removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty.....");
        }

        head = head.next;
        count--;
        return;

    }

    @Override
    public void removeLast() {
        if (head == null) {
            System.out.println("LinkedList is empty...");
        }

       if (head.next == null) {
           head = null;
       } else {
           Node curr = head;

           while (curr.next != null) {
               curr = curr.next;
           }
           curr.next = null;
           count--;
           return;
       }
    }

    @Override
    public void removeIndex(int index) {

        if (index == 0) {
            removeFirst();
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        count--;
        return;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void display() {
        Node curr = head;

        if (head == null) {
            System.out.println("Linked List is empty....");
            return;
        }

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
