package TreeSet;
import java.util.*;

public class Treeset { 
    public static void main(String[] args) {
        // Creating a TreeSet of integers...
        TreeSet<Integer> treeSet = new TreeSet<>();

        //1.  Adding elements to the TreeSet...
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(4);

        // Printing the TreeSet...
        System.out.println("TreeSet: " + treeSet);

        //2. To get higher or lower of an no. at a level...strictly less or higher...
        System.out.println("Higer of 2 is : "+treeSet.higher(2));
        System.out.println("Lower of 2 is :"+treeSet.lower(2));

        //3. To get ceiling and floor of an no....less than or equal...
        System.out.println("Ceiling of 2 is: "+treeSet.ceiling(2));
        System.out.println("Floor of 2 is: "+treeSet.floor(2));

        //4. Checking the size of the TreeSet...
        System.out.println("Size of TreeSet: " + treeSet.size());

        //5. Checking if the TreeSet is empty...
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        //6. Removing an element...
        treeSet.remove(2);

        //7. Checking if an element exists...
        boolean contains8 = treeSet.contains(8);
        System.out.println("Does TreeSet contain '8'? " + contains8);

        //8. Iterating through the TreeSet...
        System.out.println("Iterating through the TreeSet:");
        for (Integer number : treeSet) {
            System.out.println(number);
        }

        //9. Using the first() and last() methods...
        int firstElement = treeSet.first();
        int lastElement = treeSet.last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        //10. Using the headSet() method to get elements less than a specified element...
        SortedSet<Integer> headSet = treeSet.headSet(5);
        System.out.println("Elements less than '5': " + headSet);

        //11. Using the tailSet() method to get elements greater than or equal to a..
        // specified element...
        SortedSet<Integer> tailSet = treeSet.tailSet(4);
        System.out.println("Elements greater than or equal to '4': " + tailSet);

        //12. Using the subSet() method to get elements within a specified range...
        SortedSet<Integer> subSet = treeSet.subSet(2, 5);
        System.out.println("Elements between '2' and '5': " + subSet);

        //13. Clearing the TreeSet...
        treeSet.clear();

        // Checking if the TreeSet is empty after clearing
        System.out.println("Is TreeSet empty after clearing? " + treeSet.isEmpty());
    }
}

