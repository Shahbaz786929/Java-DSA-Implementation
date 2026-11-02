package CDAC.CustomLinkedList.SingleLinkedList;

public class SingleLinkedList {
    public static void main(String[] args) {

        LinkedListImpl<Integer> list = new LinkedListImpl<>();

        list.add(20);
        list.add(30);
        list.addFirst(10);
        list.addIndex(2, 25);
        System.out.println(list.size());
        list.display();

        list.removeFirst();
        list.removeLast();
        list.removeIndex(2);
        System.out.println(list.size());
        list.display();
        System.out.println(list.isEmpty());
    }
}
