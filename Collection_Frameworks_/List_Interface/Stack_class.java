package List_Interface;
import java.util.Stack;

public class Stack_class {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");

        // Displaying elements using forEach loop
        System.out.println("Elements in the Stack:");
        for (String element : stack) {
            System.out.println(element);
        }

        // Popping an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Displaying the updated stack
        System.out.println("Stack after popping: " + stack);

        // Peeking at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element without removing: " + topElement);

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Searching for an element in the stack
        int position = stack.search("Green");
        System.out.println("Position of 'Green' in the stack: " + position);
    }
}
