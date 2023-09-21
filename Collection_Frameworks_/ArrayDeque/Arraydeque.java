package ArrayDeque;

import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args){
        ArrayDeque ad = new ArrayDeque();

        ad.add(20);
        ad.add(30);
        ad.addFirst(10);
        ad.addLast(40);
        System.out.println(ad);

        ArrayDeque ad1 = new ArrayDeque();

        ad1.offer(20);
        ad1.offer(30);
        ad1.offerFirst(10);
        ad1.offerLast(40);

        System.out.println(ad1);
    }
}
