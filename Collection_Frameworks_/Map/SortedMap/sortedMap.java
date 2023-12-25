package Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class sortedMap {
    public static void main(String[] args) {
        // Creating a TreeMap of integers
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        // Adding elements to the TreeMap
        sortedMap.put(5, "Geeks");
        sortedMap.put(1, "Geeks");
        sortedMap.put(3, "Geeks");
        sortedMap.put(2, "Geeks");
        sortedMap.put(4, "Geeks");

        // Printing the TreeMap (ordered)
        System.out.println("TreeMap: " + sortedMap);

        // Checking if an element exists
        boolean containsKey3 = sortedMap.containsKey(3); // true
        boolean containsKey6 = sortedMap.containsKey(6); // false
        boolean containsValueGeeks = sortedMap.containsValue("Geeks"); // true
        boolean containsValueHello = sortedMap.containsValue("Hello"); // false

        // Removing an element
        sortedMap.remove(5);

        // Iterating through the elements
        System.out.println("Iterating through the TreeMap:");
        for (Entry<Integer, String> element : sortedMap.entrySet()) {
            System.out.println(element);
        }

        // Checking the size of the TreeMap
        System.out.println("Size of TreeMap: " + sortedMap.size()) ;

        // Clearing the TreeMap
        sortedMap.clear();

        // Checking if the TreeMap is empty after clearing
        System.out.println("Is TreeMap empty after clearing? " + sortedMap.isEmpty());
    }
}
