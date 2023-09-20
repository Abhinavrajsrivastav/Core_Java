package Inheritance;

class Being{
    void sleep(String Being){
        System.out.println("Every "+Being+"being need to sleeep");
    }
}

class Humen extends Being{
    //first child class of level 1
}

class Monkey extends Being{
   // Second child class of level -2
}
public class Inheritance_3 {

    public static void main(String[] args){
        Monkey b1 = new Monkey();
        b1.sleep("Monkey");

        Humen b2 = new Humen();
        b2.sleep("Humen");
    }
}

//Hierarchical Inheritance

//1. when we do not use extends keyword in a class declaration behind the scene an object class is automatically inherutes
//2. inside the child class in which all the inbuilt methods and properties of parent class in inherited inside the parent class
//3. A parent class can have multiple child classes but a child class can not have more then on parent class.
//4. Multiple inheritance is not allowed in Java Know as diamond Shape problem (but it has an alternative)
//
//                           ––––––––––––––
//                           Object Classes
//                           ––––––––––––––

//           ––––––––––––––                   ––––––––––––––
//           Parent-1 Class  X Diamond Shape  Parent-2 Class
//           ––––––––––––––                   ––––––––––––––

//                           ––––––––––––––
//                            Child Class
//                           ––––––––––––––
