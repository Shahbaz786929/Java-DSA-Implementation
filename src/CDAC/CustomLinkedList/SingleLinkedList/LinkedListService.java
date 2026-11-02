package CDAC.CustomLinkedList.SingleLinkedList;

public interface LinkedListService<E>  {

    void add(E data);
    void addFirst(E data);
    void addLast(E data);
    void addIndex(int index, E data);

    void removeFirst();
    void removeLast();
    void removeIndex(int index);

    int size();

    boolean isEmpty();

    void display();
}
