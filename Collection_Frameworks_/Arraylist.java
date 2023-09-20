// package List_interface;

import java.util.*;

public class Arraylist{
    private static final String True = null;

    public static void main(String[] args) {
        //1. Homogenius Type of Data....
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);

        System.out.println(al1);

        //2. Hectrogenius type of data...
        ArrayList al2 = new ArrayList();
        al2.add("Ram");
        al2.add(21);
        al2.add("Sita");
        al2.add(0);
        System.out.println(al2);

        //3. To add a collection data into another collectionn at the end....
        al2.addAll(al1);
        System.out.println("After adding the data of al1 to al2");
        System.out.println(al2);
        

        //4. To update a value of a list or Immutability of List...with shifting....
        al2.add(3,1000);
        System.out.println(al2);

        //5. duplicate are allowed....
        al2.add(1000);
        System.out.println(al2);
    }
}
