package ArrayDeque;

import java.util.ArrayDeque;
public class Arraydeque_Methods {
    
    public static void main(String[] args) {
        // Create an ArrayDeque of Strings
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements to the front of the deque
        deque.addFirst("Front1");
        deque.offerFirst("Front2");
        deque.offerFirst("Front3");

        
        // Add elements to the end of the deque
        deque.addLast("End1");
        deque.offerLast("End2");
        deque.offerLast("End3");

        // Print the deque
        System.out.println("ArrayDeque: " + deque);

        // Remove and retrieve elements from the front
        String removedFront1 = deque.removeFirst();
        String removedFront2 = deque.pollFirst();

        // Remove and retrieve elements from the end
        String removedEnd1 = deque.removeLast();
        String removedEnd2 = deque.pollLast();

        // Print the modified deque
        System.out.println("Removed Front1: " + removedFront1);
        System.out.println("Removed Front2: " + removedFront2);
        System.out.println("Removed End1: " + removedEnd1);
        System.out.println("Removed End2: " + removedEnd2);
        System.out.println("Modified ArrayDeque: " + deque);

        // Retrieve elements from the front and end without removal
        String frontPeek = deque.getFirst();
        String endPeek = deque.getLast();

        // Check if the deque is empty
        boolean isEmpty = deque.isEmpty();

        // Get the size of the deque
        int size = deque.size();

        // Clear all elements from the deque
        deque.clear();

        // Print results
        System.out.println("Front Peek: " + frontPeek);
        System.out.println("End Peek: " + endPeek);
        System.out.println("Is ArrayDeque empty? " + isEmpty);
        System.out.println("Size of ArrayDeque: " + size);
        System.out.println("ArrayDeque after clearing: " + deque);
    }
}


//1.No Capacity Restriction: Unlike arrays, there is no fixed capacity; ArrayDeque can expand as needed.
//2. Efficient for Queue and Stack Operations: ArrayDeque is efficient for implementing both queues and stacks.
//3. Null Elements: It allows null elements to be stored.
