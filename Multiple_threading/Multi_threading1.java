package Multiple_threading;

import java.util.Scanner;

// Create a thread by implementing Runnable interface
class Thread1 implements Runnable {
    public void run() {
       System.out.println("Thread1 is running...");
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("The number is: " + n+n);
    }
} 

// Create a thread by implementing Runnable interface
class Thread2 implements Runnable {
    public void run() {
       System.out.println("Thread2 is running...");
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("The number is: " +n);
    }
}  
class Thread3 implements Runnable {
    public void run() {
       System.out.println("Thread3 is running...");
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("The number is: " + n*n);
    }
}  

// Main class
public class Multi_threading1 {
    public static void main(String[] args) {
        // Create two threads
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        Thread t3 = new Thread(new Thread3());
        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
