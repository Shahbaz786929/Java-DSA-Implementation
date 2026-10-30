package CDAC.CustomArrayList;

public interface ArrayListADT<E> {

    boolean add(E element);
    void addIndex(int index, E element);
    boolean addAll(Iterable<? extends E> element);

    E get(int index);

    E set(int index, E element);

    E remove(int index);
    boolean remove(Object element);
    boolean removeAll(Iterable<?> elements);


    boolean contains(Object element);
    int indexOf(Object element);
    int lastIndexOf(Object element);

    int size();
    int capacity();
    boolean isEmpty();

    void ensureCapacity(int minCapacity);
    void trimToSize();

    void clear();

    Object[] toArray();
    void display();

}
