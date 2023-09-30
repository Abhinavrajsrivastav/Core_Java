//Describing the Pacakege name where this file belongs to
package Custom_Sorting;

//Importing the required libraries

// 1. java.util.ArrayList
import java.util.ArrayList;
// 2. java.util.Collections
import java.util.Collections;
// 3. java.util.Comparator
import java.util.Comparator; 

// Creating a Implementation of Comparator Interface "Friends" class
class Friends implements Comparator<Students>// < Specify the type for Comparator >
{ 
    // Overriding the compare method of Comparator Interface
    public int compare(Students obj1, Students obj2) {
        // Compare the ages of the two objects with the help of getAge() method ---> Security of Data

        //return 1 --> means obj1 is greater than obj2 then swaping will take place
        if (obj1.getAge() > obj2.getAge()) {
            return 1;
        } 
        //return -1 --> means obj1 is smaller than obj2 then swaping will not take place
        else if (obj1.getAge() < obj2.getAge()) {
            return -1;
        } 
        //return 0 --> means obj1 is equal to obj2 then swaping will not take place
        else {
            return 0;
        }
    }
}

// Creating a Students class to store the name and age of the students
class Students {
    // Private data members--> Only accessible within the class
    private String name;
    private int age;

    // Constructor to initialize the data members, public ---> accessible outside the class
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods to access the private data members 'name'
    public String getName() {
        return name;
    }
    // Getter methods to access the private data members 'age'
    public int getAge() {
        return age;
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return "Student Name: " + name + ", Age: " + age;
    }
}

//Head file name
public class Comparators {
    public static void main(String[] args) {
        // Create an ArrayList of Students storing objects of Students type (class)
        ArrayList<Students> list = new ArrayList<>();

        // Object creation and initialization thorugh constructor
        Students s1 = new Students("Abhinav", 21);
        Students s2 = new Students("Archit", 18);
        Students s3 = new Students("Anshika", 22);

        // Add the objects to the ArrayList
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //******Creating a custom comparator type object to compare the ages of the students...
        Friends ageComparator = new Friends();

        // *Sort the list of Students using the custom Friends comparator
        //*list--->lists of objects, **ageComparator--->Custom ageComparator
        
        Collections.sort(list, ageComparator);

        // Print the sorted list
        for (Students s : list) {
            System.out.println(s);
        }
    }
}
