package CDAC.dsaPractise.setTwo;

import java.beans.PropertyDescriptor;

public class ProductLinkedList {

    private static class Node {

        Product data;
        Node next;

        Node(Product data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int count = 0;

    public void InsertAtPosition(Product p, int pos){
        Node newNode=new Node(p);
        if(head==null){
            System.out.println("Empty linked list");
        }
        Node current=head;

        for(int i=0;i<pos-1;i++){
            current=current.next;

        }
        newNode.next=current.next;
        current.next=newNode;
        count++;
    }

    // 2. Delete all products exceeding or equal to minPrice
    public int deleteByPriceThreshold(double minPrice){
        int deleteCount=0;

        while (head != null && head.data.price >= minPrice)
            head = head.next;
        deleteCount++;
        count--;


        Node current=head;
        while(current.next!=null){
            if(current.next.data.price>=minPrice){
                current.next=current.next.next;
                deleteCount++;
                count--;
            }
            current=current.next;
        }
        return deleteCount;
    }
    // 3. Return current size
     public int size() {
     return count;
     }

     public void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
         System.out.println();
     }
}
