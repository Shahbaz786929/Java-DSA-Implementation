package CDAC.CustomLinkedList.DoublyLinkedList;

public class DoublyLinkedList {

    public static void main(String[] args) {

        DoublyLinkedListimpl<Integer> list = new DoublyLinkedListimpl<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.display();
        list.displayReverse();

        list.addFirst(5);
        list.display();

        list.addLast(40);
        list.display();
        list.displayReverse();


        list.addIndex(2, 15);
        list.display();
        list.displayReverse();

        list.removeFirst();
        list.display();

        list.removeLast();
        list.display();

        list.removeIndex(1);
        list.display();

        System.out.println("Size: " + list.size());

        System.out.println("Is Empty: " + list.isEmpty());
    }
}
