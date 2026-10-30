package DSA.Stack;

class Node {
    Object element;
    Node next;

    Node(Object element) {
        this.element = element;
    }

    Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }
}

public class Stack {
    Node head = null;
    int count = 0;

    public void push(Object element) {
        Node n = new Node(element);
        n.next = head;
        head = n;
        count++;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Object peek() {
        if (head == null) throw new RuntimeException("Stack is empty");
        return head.element;
    }

    public Object pop() {
        if (head == null) throw new RuntimeException("Stack is empty");
        Object key = head.element;
        head = head.next;
        count--;
        return key;
    }

    public void display() {
        if (head == null) {
            System.out.println("The Stack is empty!");
            return;
        }
        Node curr = head;
        System.out.print("Top -> ");
        while (curr != null) {
            System.out.print(curr.element + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.display();
    }
}
