package List_Interface;

import java.util.ArrayList;

public class Arraylist_Methods {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add elements to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print the ArrayList
        System.out.println("ArrayList: " + colors);

        // Access elements by index
        String firstColor = colors.get(0);
        System.out.println("First color: " + firstColor);

        // Modify an element
        colors.set(1, "Purple");
        System.out.println("Modified ArrayList: " + colors);

        // Remove an element by index
        String removedColor = colors.remove(3);
        System.out.println("Removed color: " + removedColor);
        System.out.println("ArrayList after removal: " + colors);

        // Check if the ArrayList is empty
        boolean isEmpty = colors.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);

        // Get the size of the ArrayList
        int size = colors.size();
        System.out.println("Size of ArrayList: " + size);

        // Check if the ArrayList contains a specific element
        boolean containsGreen = colors.contains("Green");
        System.out.println("Does ArrayList contain 'Green'? " + containsGreen);

        // Clear all elements from the  ArrayList
        colors.clear();
        System.out.println("ArrayList after clearing: " + colors); 
    }
}
