package DSA.LinkedList.SingleLinkedList;

public class LinkedListByApnaClg {

    Node head;
    private int size;

    public LinkedListByApnaClg() {
        this.size = size;
    }

    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void add(Object data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }


    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(Object data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void display () {
        if (head == null){
            System.out.println("List is Empty");
            return;
        }

        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }

    public void removefirst () {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast () {
        if (head == null) {
            System.out.println("The list is Empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            curr = curr.next;
        }

        curr.next = null;
    }

    public int getSize() {
        return size;
    }


    public static void main(String[] args) {
        LinkedListByApnaClg list = new LinkedListByApnaClg();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.display();

        list.addLast(60);
        list.display();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.display();

        list.removefirst();
        list.removeLast();
        list.display();

        System.out.println(list.getSize());
    }
}
