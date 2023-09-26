package List_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_LIterator {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(); 

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        System.out.println("ArrayList: " + numbers);

        //With  For Loop...
        System.out.println("Iterating ArrayList using for loop");
        for(int i = 0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        //with For each loop...
        System.out.println("Iterating ArrayList using foreach loop");
        for(Object number : numbers){
            System.out.println(number);
        }


        //Using iterator and list Iterator...
        //1.
        System.out.println("Iterating ArrayList using iterator");
        Iterator iterate = numbers.iterator();

        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
        //2...
        System.out.println("Iterating ArrayList using list iterator");
        ListIterator<Integer> iterate1 = numbers.listIterator(numbers.size());

        while(iterate1.hasPrevious()){
            System.out.println(iterate1.previous());
        }
    }

    
}
