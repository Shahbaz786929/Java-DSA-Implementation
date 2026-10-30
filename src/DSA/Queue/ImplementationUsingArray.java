package DSA.Queue;

public class ImplementationUsingArray {
    private Object[] arr;
    int size = 0;
    int capacity = 0;

    public ImplementationUsingArray (int capacity) {
        this.capacity = capacity;
        arr = new Object[capacity];
        size = 0;
    }


    public void add(Object data){

        if (size == capacity){
            System.out.println("Queue is full");
            return;
        }
        arr[size] = data;
        size++;

    }


    public void poll() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!!");
            return;
        }
        System.out.println("\nPoll element = " + arr[0]);
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
    }

    public void peek() {
        System.out.println();
        System.out.println(" Peek Element = " + arr[size - 1]);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }
    public static void main(String[] args) {
        ImplementationUsingArray queue = new ImplementationUsingArray(20);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.display();
        
        queue.peek();
        queue.display();

        queue.poll();
        queue.display();

        queue.peek();
        queue.display();
    }
}




