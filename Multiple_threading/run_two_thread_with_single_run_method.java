package Multiple_threading;

class Thread1 extends Thread {
    public void run(){
        String td = Thread.currentThread().getName();
        if(td.equals("addition")){
            addition();
        }
        else if(td.equals("subtraction")){
            subtraction();
        }
        else{
            System.out.println("No thread is running...");
        }
    }
    

    public void addition(){
        System.out.println("Addition method is running...");
    }

    public void subtraction(){
        System.out.println("Subtraction method is running...");
    }
}



public class run_two_thread_with_single_run_method {
    public static void main(String[] args){

        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();

        t1.setName("addition");
        t2.setName("subtraction");

        t1.start();
        t2.start();
    }
}
