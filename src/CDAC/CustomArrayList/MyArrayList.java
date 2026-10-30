package CDAC.CustomArrayList;
import java.util.Objects;

public class MyArrayList<E> implements ArrayListADT<E> {

    private E[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // custom capacity
    @SuppressWarnings("unchecked")
    public MyArrayList(int initialCapacity) {

        if (initialCapacity < 0) {
            throw new ArrayListException.InvalidCapacityException("Capacity cannot be negative");
        }

        array = (E[]) new Object[initialCapacity];
        size = 0;
    }

    // increase arraylist capacity automatically
    @SuppressWarnings("unchecked")
    private void grow () {
        int newCapacity;

        if (array.length == 0) {
            newCapacity = 1;
        } else {
            newCapacity = array.length * 2;
        }

        E[] newArray = (E[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public boolean add(E element) {

        if (size == array.length) {
            grow();
        }
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public void addIndex(int index, E element) {
        if (index < 0 || index > size) {
            throw new ArrayListException.InvalidIndexException("Index: " + index + ", Size: " + size);
        }

        if (size == array.length) {
            grow();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;

    }

    @Override
    public boolean addAll(Iterable<? extends E> element) {

        if (element == null) {
            throw new NullPointerException("Collection cannot be null.");
        }
        boolean modified = false;
        for (E elements : element) {
            add(elements);
            modified = true;
        }
        return modified;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayListException.InvalidIndexException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new ArrayListException.InvalidIndexException("Index: " + index + ", Size: " + size);
        }

        E oldElement = array[index];
        array[index] = element;
        return oldElement;
    }

    @Override
    public E remove(int index) {
        if (isEmpty()) {
            throw new ArrayListException.EmptyListException("Cannot remove element from an empty list.");
        }

        if (index > 0 || index >= size) {
            throw new ArrayListException.InvalidIndexException("Index: " + index + ", Size: " + size);
        }

        E removedElement = array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;

        return removedElement;
    }

    @Override
    public boolean remove(Object element) {
        int index = indexOf(element);

        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }


    @Override
    public boolean removeAll(Iterable<?> elements) {

        if (elements == null) {
            throw new NullPointerException("Collection cannot be null.");
        }
        boolean modified = false;
        int i = 0;

        while (i < size) {
            boolean found = false;

            for (Object element : elements) {
                if (java.util.Objects.equals(array[i], element)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                remove(i);
                modified = true;
            } else {
                i++;
            }
        }

        return modified;
    }

    @Override
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(array[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object element) {
        for (int i = size - 1; i >= 0; i--) {
            if (Objects.equals(array[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new ArrayListException.InvalidCapacityException("Minimum capacity cannot be negative.");
        }

        if (minCapacity <= array.length) {
            return;
        }

        int newCapacity = array.length == 0 ? 1 : array.length;

        while (newCapacity < minCapacity) {
            int nextCapacity = newCapacity * 2;

            if (nextCapacity < 0) {
                newCapacity = minCapacity;
                break;
            }
            newCapacity = nextCapacity;
        }

        E[] newArray = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    @Override
    @SuppressWarnings("unchecked")
    public void trimToSize() {
        if (size == array.length) {
            return;
        }
        E[] newArray = (E[]) new Object[size];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public Object[] toArray() {
        Object [] result = new Object[size];

        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Override
    public void display() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
