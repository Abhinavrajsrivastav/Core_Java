package Map.HashMap;

import java.util.TreeMap;

public class TreeHashmap {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Put key-value pairs into the TreeMap
        treeMap.put("Alice", 25);
        treeMap.put("Bob", 30);
        treeMap.put("Charlie", 22);
        
        

        // Get and print the value associated with a key
        int age = treeMap.get("Alice");
        System.out.println("Alice's age is: " + age);

        // Remove a key-value pair
        treeMap.remove("Bob");
        System.out.println("Size of TreeMap after removing Bob: " + treeMap.size());

        // Check if the TreeMap is empty
        boolean empty = treeMap.isEmpty();
        System.out.println("Is the TreeMap empty? " + empty);

        // Check if the TreeMap contains a specific key
        boolean contains = treeMap.containsKey("Charlie");
        System.out.println("Does the TreeMap contain Charlie? " + contains);

        // Check if the TreeMap contains a specific value
        boolean containsValue = treeMap.containsValue(22);
        System.out.println("Does the TreeMap contain the value 22? " + containsValue);

        // Print all key-value pairs in the TreeMap
        System.out.println("All key-value pairs in the TreeMap:");
        for (String key : treeMap.keySet()) {
            int value = treeMap.get(key);
            System.out.println(key + ": " + value);
        }
        // Using Java Streams to print key-value pairs
        System.out.println("hello world!");
    }
}
