package PriorityQue;

import java.util.PriorityQueue;
import java.util.Comparator;
public class Prioriryque {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (natural ordering)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(50);
        priorityQueue.offer(20);
        priorityQueue.offer(40);

        // Print the PriorityQueue
        System.out.println("PriorityQueue (natural ordering): " + priorityQueue);

        // Retrieve and remove elements from the PriorityQueue
        int removed1 = priorityQueue.poll();
        int removed2 = priorityQueue.remove();

        // Print the removed elements and modified PriorityQueue
        System.out.println("Removed element (poll): " + removed1);
        System.out.println("Removed element (remove): " + removed2);
        System.out.println("Modified PriorityQueue: " + priorityQueue);

        // Retrieve but do not remove the highest-priority element
        int peeked = priorityQueue.peek();

        // Check if the PriorityQueue is empty
        boolean isEmpty = priorityQueue.isEmpty();

        // Get the size of the PriorityQueue
        int size = priorityQueue.size();

        // Clear all elements from the PriorityQueue
        priorityQueue.clear();

        // Print results
        System.out.println("Peeked element: " + peeked);
        System.out.println("Is PriorityQueue empty? " + isEmpty);
        System.out.println("Size of PriorityQueue: " + size);
        System.out.println("PriorityQueue after clearing: " + priorityQueue);

    }
}
