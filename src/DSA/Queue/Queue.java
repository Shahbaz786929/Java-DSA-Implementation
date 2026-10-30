package DSA.Queue;

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

public class Queue {
    Node head = null;
    Node tail = null;
    int count = 0;


    public void add(Object element) {
        Node n = new Node(element);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        count++;
    }


    public int size() {
        return count;
    }


    public boolean isEmpty() {
        return count == 0;
    }


    public Object peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        return head.element;
    }


    public Object poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Nothing to remove.");
            return null;
        }
        Object key = head.element;
        head = head.next;
        count--;
        if (head == null) tail = null;
        return key;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
            return;
        }
        Node curr = head;
        System.out.print("Front -> ");
        while (curr != null) {
            System.out.print(curr.element + " ");
            curr = curr.next;
        }
        System.out.println("<- Rear");
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.display();
        System.out.println("Peek: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        queue.display();
        System.out.println("Size: " + queue.size());
    }
}
