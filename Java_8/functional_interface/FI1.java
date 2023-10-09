package Java_8.functional_interface;

interface A{
    void show();
}

public class FI1 {
    public static void main(String[] args) {
       A obj = new A(){
              public void show(){
                System.out.println("Hello");
              }    
         };
         obj.show();
       }
    }
