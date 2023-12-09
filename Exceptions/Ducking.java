package Exceptions;

public class Ducking {
   //ducking is basically ducking exception object is the no responsibility of 
   //the method in which exception has occured and leave it to handle by the calling method...
    class Demo{
        public void printMessage() throws Exception{
            try {
                int[] myNumbers = {1, 2, 3};
                System.out.println(myNumbers[10]);
                System.out.println("Exception ocurrese in Demo class");
            }
            finally{
                System.out.println("Finally block in Demo class is executed");
            }
        }
    }

    public static void main(String[] args){
        try {
            try_catch_throw.Demo d = new try_catch_throw().new Demo();
            d.printMessage();
        }  
        catch (Exception e) {
            //Exception comes eother from printMessage() or from main()...
            System.out.println("Exception happed in The demo class or in the main method...");
        } finally {
            //...but finally is always executed
            System.out.println("The 'try catch' is finished.");
        }
    }
}
