package Map.HashMap;

import java.util.*;

public class hashMap {
    public static void main(String[] args){
        //collection of key-value pairs is called an entry...

        // Creating a HashMap of String keys and Integer values...
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding Key and Value pairs to HashMap...
        hashMap.put("a", null);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        hashMap.put("d", 4);
        hashMap.put("e", 5);
        hashMap.put("f", 6); 

        //  Printing the HashMap (unordered)...
        System.out.println("HashMap: " + hashMap);

        // Checking if a Key exists...
        System.out.println(hashMap.get("a"));

        // Checking if a Value exists...
        System.out.println(hashMap.containsKey("a"));

        // Removing a Key...
        System.out.println(hashMap.containsValue(1));

        //Removing a Value...
        int removeValue = hashMap.remove("a");
        System.out.println("Removed value: " + removeValue);

        //Printing the HashMap after removal...
        System.out.println("Updated HashMap: " + hashMap);

        //Size of HashMap...
        System.out.println("size: " + hashMap.size());

        //Checking if HashMap is empty...
        System.out.println("Is HashMap empty? " + hashMap.isEmpty());

        //Getting all the keys present in the HashMap...
        System.out.println("KeySet: " + hashMap.keySet());

        //Getting all the values present in the HashMap...
        System.out.println("Values: " + hashMap.values());

        //clearing the HashMap...
        hashMap.clear() ;

        //key pair can not be duplicate...
        //value can be duplicate...
    }
}
