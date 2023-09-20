package Inheritance;

class Indian{
    //Parent Class
    String name = "Ram Chandra";
    int age = 21;
    String Address = "Ayodhya";
}

class Up extends Indian{
    //First Child Class
}
class Ayodhya extends Up{
    //Second child class
}
public class Inheritance_2 {
public static void main(String[] args){
    Ayodhya p1 = new Ayodhya();
    System.out.print("Bhagwan Shri "+p1.name+" lived in "+p1.Address);
}
}

//Multiple level Inheritance