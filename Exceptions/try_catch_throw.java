package Exceptions;

public class try_catch_throw {

    class Demo{
        public void printMessage() throws Exception{
            try {
                int[] myNumbers = {1, 2, 3};
                System.out.println(myNumbers[10]);
                System.out.println("Exception ocurrese in Demo class");
            } catch (Exception e) {
                throw e;
                //Exception is through in the calling method (main)
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
            System.out.println("Something went wrong.");
        } finally {
            //...but finally is always executed
            System.out.println("The 'try catch' is finished.");
        }
    }
}
