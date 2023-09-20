package Encapsulation;

class students{
    private int age; // instance variable
    private String name; // instance variable
 private String name1 = "arun";
    public void setData(){
        age = 21;
        name = "Archit";
    }
    public void show(){
        System.out.println("your name is "+name+" and your age is "+age);
    }
}
public class Lec_1 {

    public static void main(String[] args){
      students s1 = new students();
      s1.setData();
      s1.show();
    }
}
