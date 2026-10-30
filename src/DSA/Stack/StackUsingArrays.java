package DSA.Stack;

public class StackUsingArrays {

    Object[] arr;
    int capacity;
    int size;

    public StackUsingArrays (int capacity) {
        this.capacity = capacity;
        arr = new Object[capacity];
        size = 0;
    }

    public void push (Object data) {
    if (size == capacity) {
        System.out.println("Stack is full...");
        return;
    }
    for (int i = 0; i < size - 1; i++) {
        arr[i] = arr[i + 1];
    }
    arr[size] = data;
        size++;
        return;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.....");
        }
       arr[size] = null;
        size--;
    }


    public void peek() {
        System.out.println();
        System.out.println(" Peek Element = " + arr[size - 1]);
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty!");
//            return;
//        }
        System.out.print("Stack elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackUsingArrays stack = new StackUsingArrays(30);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.size());
        stack.display();

        stack.pop();
        stack.display();

    }
}
