package Custom_Sorting;
import java.util.*;

public class Custom_sorting {
     static class Students{
         private String name;
         private int age;
     
         public Students(String name, int age){
             this.name = name;
             this.age = age;
         }

         // Override the toString method to provide a custom string representation
         @Override
         public String toString() {
             return "Student Name: " + name + ", Age: " + age;
         }
         // When you print an object using System.out.println(s), Java
         // internally calls the toString() method of that object to get its string
         // representation.
     }

     
public static void main(String[] args){
 List<Students> list = new ArrayList<>();
    // list.add(5);
    // list.add(2);
    // list.add(8);
    // list.add(1);
    // list.add(19);
    // System.out.println("Before Sorting: " + list);
    // Collections.sort(list);
    // System.out.println("After Sorting: " + list);

    //Adding Objects Instead Of Elements...
    Students s1 = new Students("Abhinav",21);
    Students s2 = new Students("Archit",18);
    Students s3 = new Students("Anshika",22);
    Students s4 = new Students("Shreya",19);

    list.add(s1);
    list.add(s2);
    list.add(s3);
    list.add(s4);

    for(Students s: list)
   System.out.println(s);
    // Collections.sort(list);

    //Here the confusion arrives how an obejct which have different entities can be sorted...


}
}
