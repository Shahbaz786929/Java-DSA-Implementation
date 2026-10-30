package DSA.LinkedList.SingleLinkedList;

public class LinkedListUsingArray {

    private Object [] arr;
    private int size;
    private int capacity;

    public LinkedListUsingArray (int capacity) {
        this.capacity = capacity;
        arr = new Object[capacity];
        size = 0;
    }

    public void addFirst(Object data) {
        if (size == capacity) {
            System.out.println("List is full");
            return;
        }
        for (int i = size; i>0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = data;
        size++;
    }

    public void addLast(Object data) {
        if (size == capacity) {
            System.out.println("The List is full!!!!");
            return;
        }
        arr[size] = data;
        size++;

    }

    public void add(Object data) {
         addLast(data);
    }

    public void removeFirst () {
        if (size == 0) {
            System.out.println("The list is empty");
            return;
        }
        for (int i = 0; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void removeLast () {
        if (size == 0) {
            System.out.println("The List is empty");
            return;
        }
        arr[size - 1] = null;
        size--;
    }

    public void display () {
        if (size == 0) {
            System.out.println("The list is Empty");
            return;
        }
        for (int i = 0; i < size - 1; i++){
            System.out.print(arr[i] + " -> ");
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedListUsingArray list = new LinkedListUsingArray(30);
        list.add(5);
        list.add(10);
        list.addFirst(1);
        list.addLast(30);
        list.getSize();
        list.display();
        list.add(40);
        list.display();
    }
}
