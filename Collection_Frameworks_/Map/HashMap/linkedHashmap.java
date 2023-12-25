package Map.HashMap;

import java.util.*;

public class linkedHashmap {
    public static void main(String[] args){
        System.out.println(args[0]);
        //collection of key-value pairs is called an entry...
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        //Adding Key and Value pairs to LinkedHashMap...
        lhm.put(1,"Archit");
        lhm.put(4,"Abhinav");
        lhm.put(5,"Anubhav");

        //Printing the LinkedHashMap (ordered)...
        System.out.println("LinkedHashMap: " + lhm);

        //Getting a value for a given key...
        String name = lhm.get(4);
        System.out.println("Name of Roll no. 4 is: " + name);

        //Checking if a Key exists...
        System.out.println("Contains key 5? " + lhm.containsKey(5));

        //Checking if a Value exists...
        System.out.println("contains value 'Anuj'? " + lhm.containsValue("Anuj"));

        //Removing a Key...
        String name2 = lhm.remove(5);
        System.out.println("Removed value: " + name2);
        System.out.println("Updated LinkedHashMap: " + lhm);

        //Size of HashMap...
        System.out.println("Size: " + lhm.size());

        //Checking if HashMap is empty...
        System.out.println("Is empty? " + lhm.isEmpty());

        //Getting all the keys present in the HashMap...
        System.out.println("KeySet: " + lhm.keySet());

        //Getting all the values present in the HashMap...
        System.out.println("Values: " + lhm.values());

        //clearing the HashMap...
        lhm.clear();

    }

}
