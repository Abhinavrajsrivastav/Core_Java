package Multiple_threading;

class Thread1 implements Runnable {
    public void run() {
       System.out.println("Thread1 is running...");
    }
} 

class Thread2 implements Runnable {
    public void run() {
       System.out.println("Thread2 is running...");
    }
}   

public class Multi_threading1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }
}
