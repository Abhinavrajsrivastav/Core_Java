//Describing the Package name
package Custom_Sorting;

//Importing the required libraries

// 1. java.util.ArrayList
import java.util.ArrayList;

// 2. java.util.Collections
import java.util.Collections;

// 3. java.util.Comparator
import java.util.List;

// Creating a Implementation of Comparable Interface "Person" class
class Person implements Comparable<Person> {
    // Private data members--> Only accessible within the class
    private String name;
    private int age;

    // Constructor to initialize the data members, public ---> accessible outside the class
    public Person(String name, int age) {
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
    //
    @Override
    public int compareTo(Person this,Person that) {
        // Compare people based on their ages
        return Integer.compare(this.age, that.age);
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

//Head main class
public class Comparables {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        // Add some people to the list
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort the list of Person objects using their natural ordering (by age)
        Collections.sort(people);

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

