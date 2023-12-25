package List_Interface; 
import java.util.Enumeration;
import java.util.Vector;

public class Vector_class {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Displaying elements using forEach loop
        System.out.println("Elements in the Vector:");
        for (String element : vector) {
            System.out.println(element);
        }

        // Accessing elements by index
        System.out.println("Element at index 1: " + vector.get(1));

        // Updating an element
        vector.set(2, "Grapes");
        System.out.println("Updated Vector: " + vector);

        // Removing an element
        vector.remove("Apple");
        System.out.println("Vector after removing 'Apple': " + vector);

        // Checking if the Vector contains an element
        System.out.println("Does the Vector contain 'Banana'? " + vector.contains("Banana"));

        // Getting the size of the Vector
        System.out.println("Size of the Vector: " + vector.size());

        // Enumerating elements using Enumeration
        Enumeration<String> enumeration = vector.elements();
        System.out.println("Enumerating elements:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
