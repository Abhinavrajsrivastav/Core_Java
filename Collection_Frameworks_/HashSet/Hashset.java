package HashSet;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        // Creating a HashSet of integers
        HashSet<Integer> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(1);
        hashSet.add(2); // Duplicate, will be ignored

        // Printing the HashSet (unordered)
        System.out.println("HashSet: " + hashSet);

        // Checking if an element exists
        boolean contains5 = hashSet.contains(5); // true
        boolean contains3 = hashSet.contains(3); // false

        // Removing an element
        hashSet.remove(8);

        // Iterating through the elements
        System.out.println("Iterating through the HashSet:");
        for (Integer element : hashSet) {
            System.out.println(element);
        }

        // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // Clearing the HashSet
        hashSet.clear();

        // Checking if the HashSet is empty after clearing
        System.out.println("Is HashSet empty after clearing? " + hashSet.isEmpty());
    }
}
