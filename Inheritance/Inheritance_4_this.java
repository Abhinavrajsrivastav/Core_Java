package Inheritance;

// Types of methods in inheritance

////1... Inherited method
//class Aeroplane{
//    public void takeOff(){
//        System.out.println("Aeroplane is taking Off");
//    }
//    public void fly(){
//        System.out.println("Aeroplane is Flying");
//    }
//}
//class cargoPlane extends Aeroplane{
//
//}
//
//class passengerPlane extends Aeroplane{
//
//}
//
//
//public class Inheritance_4_this {
//    public static void main(String[] args){
//    cargoPlane cp = new cargoPlane();
//    cp.takeOff();
//    cp.fly();
//    }
//}

////2.. Overriden Method
//class Aeroplane{
//    public void takeOff(){
//        System.out.println("Aeroplane is taking Off");
//    }
//    public void fly(){
//        System.out.println("Aeroplane is Flying");
//    }
//}
//class cargoPlane extends Aeroplane{
//    public void takeOff(){
//        System.out.println("Aeroplane is taking Off-->Overriding");
//    }
//    public void fly(){
//        System.out.println("Aeroplane is Flying-->Overriding");
//    }
//}
//
//class passengerPlane extends Aeroplane{
//
//}
//
//
//public class Inheritance_4_this {
//    public static void main(String[] args){
//        cargoPlane cp = new cargoPlane();
//        cp.takeOff();
//        cp.fly();
//    }
//}


//3.. specialized Method
class Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane is taking Off");
    }
    public void fly(){
        System.out.println("Aeroplane is Flying");
    }
}
class cargoPlane extends Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane is taking Off-->Overriding");
    }
    public void fly(){
        System.out.println("Aeroplane is Flying-->Overriding");
    }
    public void carryGoods(){
        System.out.println("carryGoods--->Specialized Method");
    }
}

class passengerPlane extends Aeroplane{

}


public class Inheritance_4_this {
    public static void main(String[] args){
        cargoPlane cp = new cargoPlane();
        cp.takeOff();
        cp.fly();
        cp.carryGoods();
    }
}
