package HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Sorted_Set {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        Set<Integer> sortedSet = new HashSet<>();

        // Adding elements to the TreeSet
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(8);
        sortedSet.add(1);
        sortedSet.add(2); // Duplicate, will be ignored

        // Printing the TreeSet (ordered)
        System.out.println("TreeSet: " + sortedSet);

        // Checking if an element exists
        boolean contains5 = sortedSet.contains(5); // true
        boolean contains3 = sortedSet.contains(3); // false

        // Removing an element
        sortedSet.remove(8);

        // Iterating through the elements
        System.out.println("Iterating through the TreeSet:");
        for (Integer element : sortedSet) {
            System.out.println(element);
        }

        // Checking the size of the TreeSet
        System.out.println("Size of TreeSet: " + sortedSet.size()) ;

        // Clearing the TreeSet
        sortedSet.clear();

        // Checking if the TreeSet is empty after clearing
        System.out.println("Is TreeSet empty after clearing? " + sortedSet.isEmpty());
    }
}
