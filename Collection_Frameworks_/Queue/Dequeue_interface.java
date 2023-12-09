import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_interface {
    public static void main(String[] args) {
        // Creating a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the front of the deque
        deque.addFirst("Red");
        deque.addFirst("Green");

        // Adding elements to the end of the deque
        deque.addLast("Blue");

        // Displaying elements using forEach loop
        System.out.println("Elements in the Deque:");
        for (String element : deque) {
            System.out.println(element);
        }

        // Removing elements from the front and end of the deque
        String removedFirst = deque.removeFirst();
        String removedLast = deque.removeLast();

        System.out.println("Removed element from the front: " + removedFirst);
        System.out.println("Removed element from the end: " + removedLast);

        // Displaying the updated deque
        System.out.println("Deque after removal: " + deque);

        // Peeking at the front and end elements without removing them
        String peekFirst = deque.peekFirst();
        String peekLast = deque.peekLast();

        System.out.println("Front element without removing: " + peekFirst);
        System.out.println("End element without removing: " + peekLast);

        // Checking if the deque is empty
        System.out.println("Is the deque empty? " + deque.isEmpty());
    }
}
