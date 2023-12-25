package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet {
    public static void main(String[] args){
        // Creating a LinkedHashSet of integers
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(8);
        linkedHashSet.add(1);
        linkedHashSet.add(2); // Duplicate, will be ignored

        // Printing the LinkedHashSet (ordered)
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Checking if an element exists
        boolean contains5 = linkedHashSet.contains(5); // true
        boolean contains3 = linkedHashSet.contains(3); // false

        // Removing an element
        linkedHashSet.remove(8);

        // Iterating through the elements
        System.out.println("Iterating through the LinkedHashSet:");
        for (Integer element : linkedHashSet) {
            System.out.println(element);
        }

        // Checking the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size()) ;

        // Clearing the LinkedHashSet
        linkedHashSet.clear();

        // Checking if the LinkedHashSet is empty after clearing
        System.out.println("Is LinkedHashSet empty after clearing? " + linkedHashSet.isEmpty());
    }
}
