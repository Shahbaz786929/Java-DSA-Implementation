package CDAC.dsaPractise.setTwo;

public class ProductReturnStack {

    private static class Node {
        Product data;
        Node next;

        Node(Product data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;
    int count = 0;

    public void push(Product data) {
        Node n = new Node(data);
        if(top==null){

            top=n;
            count++;
            return;
        }
        n.next=top;
        top=n;
        count++;
    }
    public Product  pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        Product t=top.data;
        top=top.next;
        count--;
        return t;
    }

    public Product peek(){
        return top.data;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public int size(){
        return count;
    }
    public void display(){
        Node current=top;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) {
        ProductReturnStack returns=new ProductReturnStack();
        System.out.println("Return stack empty initially? " + returns.isEmpty());
        System.out.println("\n--- PUSHING RETURNED PACKAGES ---");
        returns.push(new Product(401, "Bluetooth Speaker", "Audio", 4.2, 1999.0));
        returns.push(new Product(402, "Winter Jacket", "Apparel", 4.0, 3499.0));
        returns.push(new Product(403, "Running Shoes", "Footwear", 4.7, 4299.0));
        returns.display();System.out.println("\n--- PEEK AT TOP ---");
        System.out.println("Next for inspection: " + returns.peek());
        System.out.println("\n--- INSPECTING PACKAGES (POP) ---");
        System.out.println("Inspected: " + returns.pop());
        System.out.println("Inspected: " + returns.pop());
        System.out.println("\n--- CURRENT STACK ---");
        returns.display();
        System.out.println("\nInspected: " + returns.pop());
        System.out.println("Inspecting from empty stack: " + returns.pop());
    }
}
