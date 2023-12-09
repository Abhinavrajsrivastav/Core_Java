package List_Interface;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class linkedList_class {
    public static void main(String[] args) {
        //code of all methods on linkedlist class is same as arraylist class

        LinkedList<Integer> ll = new LinkedList<Integer>();

        //add() method is used to add elements in linkedlist
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        //print linkedlist
        System.out.println(ll);

        //addFirst() method is used to add element at first position
        ll.addFirst(0);

        //addLast() method is used to add element at last position
        ll.addLast(6);

        System.out.println(ll);

        //remove and return first element
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

        //get first and last element
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        //contains() method is used to check if element is present in linkedlist
        System.out.println(ll.contains(3));

        //indexOf() method is used to get index of element
        System.out.println(ll.indexOf(3));

        //size() method is used to get size of linkedlist
        System.out.println(ll.size());

        //get() method is used to get element at specified index
        System.out.println(ll.get(3));

        //set() method is used to set element at specified index
        ll.set(3, 10);

        System.out.println(ll);

        //remove() method is used to remove element at specified index
        ll.clear();

        System.out.println(ll);

        //to sort the linkedlist
        Collections.sort(null, null);

    }
}
