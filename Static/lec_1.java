package Static;


import java.util.Scanner;

class Farmer{
    int amount;
    float time; // 1.2 ->>> 1.2 year
    float si;
    static float rate;
     static{
         rate = 5.5f;
     }

     void input(){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter the amount: ");
         amount = sc.nextInt();
         System.out.print("Enter time duaration of loan: ");
         time = sc.nextFloat();
    }
   static void demo(){
       System.out.println("Static method: ");
   }
    void calculate(){
         si = (amount*time*rate)/100f;
    }

    void show(){
        System.out.println("The simple intrest for the loan is : "+si);
    }
}

public class lec_1 {
    public static void main(String[] args){
      Farmer f1 = new Farmer();
      Farmer f2 = new Farmer();

      f1.input();
      f1.calculate();
      f1.show();

        f2.input();
        f2.calculate();
        f2.show();

        Farmer.demo();
    }
}
