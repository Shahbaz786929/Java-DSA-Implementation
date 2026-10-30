package CDAC.CustomArrayList;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>(5);


        try {

            // Adding Elements
            System.out.println("Adding Elements:");

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

            list.display();

            // Insert at Index
            System.out.println("\nInsert 15 at Index 1:");

            list.addIndex(1, 15);

            list.display();

            // Get Element
            System.out.println("\nElement at Index 2:");

            System.out.println(list.get(2));

            // Update Element
            System.out.println("\nUpdate Index 2:");

            int oldValue = list.set(2, 100);

            System.out.println("Old Value: " + oldValue);

            list.display();

            // Searching
            System.out.println("\nSearching:");

            System.out.println("Contains 30: " +
                    list.contains(30));

            System.out.println("Index of 30: " +
                    list.indexOf(30));

            // Add More Elements
            System.out.println("\nAdding Multiple Elements:");

            list.addAll(
                    java.util.Arrays.asList(50, 60, 70)
            );

            list.display();

            // Size and Capacity
            System.out.println("\nSize: " + list.size());

            System.out.println("Capacity: " + list.capacity());

            // Remove Element
            System.out.println("\nRemove Index 1:");

            System.out.println("Removed: " + list.remove(1));

            list.display();

            // Remove By Value
            System.out.println("\nRemove Value 50:");

            list.remove(Integer.valueOf(50));

            list.display();

            // Trim Capacity
            System.out.println("\nBefore Trim:");

            System.out.println("Capacity: " + list.capacity());

            list.trimToSize();

            System.out.println("After Trim:");

            System.out.println("Capacity: " + list.capacity());

            // Convert to Array
            System.out.println("\nConvert to Array:");

            System.out.println(
                    java.util.Arrays.toString(list.toArray())
            );

            // Clear
            System.out.println("\nClear List:");

            list.clear();

            System.out.println("Size: " + list.size());

            System.out.println("Is Empty: " + list.isEmpty());

            System.out.println("Capacity: " + list.capacity());

        } catch (ArrayListException.InvalidIndexException |
                 ArrayListException.EmptyListException |
                 ArrayListException.InvalidCapacityException e) {

            System.out.println("Exception: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}

