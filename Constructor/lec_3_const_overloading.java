package Constructor;

class Fruits{
    private String name;
    private int price;

    public Fruits(){
        this.name = "Banana";
        this.price = 40;
    }

    public Fruits(int price){
        this.price = price;
        this.name = "Apple";
    }
    public Fruits(int price, String name){
        this.price = price;
        this.name = name;
    }

    public void show(){
        System.out.println(name+" "+price);
    }
}
public class lec_3_const_overloading {
    public static void main(String[] agrs){
        Fruits F1 = new Fruits();
        F1.show();
        Fruits F2 = new Fruits(100);
        F2.show();
        Fruits F3 = new Fruits(70,"Grapes");
        F3.show();
    }
}
