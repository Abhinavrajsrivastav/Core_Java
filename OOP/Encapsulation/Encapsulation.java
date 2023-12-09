package OOP.Encapsulation;

public class Encapsulation {
//class inside a class (sub-classes)
class Fan{
    private String name;
    private int price;

    void setter(String name, int price){
        this.name = name;
        this.price = price;
    }

    void getter(){
        System.out.println("Name is "+name+" and price is "+price);
    }
}

class Havells extends Fan{
    void havells(){
        Fan f1 = new Fan();
        f1.setter("Havell's",2000);
        f1.getter();
    }
}

public static void main(String[] args){
    Encapsulation encapsulation = new Encapsulation();
    Havells h1 = encapsulation.new Havells();
    h1.havells();
}
}
