package Multiple_threading;
// Create a thread by implementing Runnable interface
class Thread1 implements Runnable {
    public void run() {
       System.out.println("Thread1 is running...");
    }
} 

// Create a thread by implementing Runnable interface
class Thread2 implements Runnable {
    public void run() {
       System.out.println("Thread2 is running...");
    }
}   

// Main class
public class Multi_threading1 {
    public static void main(String[] args) {
        // Create two threads
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        // Start the threads
        t1.start();
        t2.start();
    }
}
