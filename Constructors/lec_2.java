package Constructors;
class Students{
    private int age;
    private String name;

    public Students(){
        System.out.println("Hello Mr. "+name+" You are now "+age+" Years old");
    }
    public Students(int age,String name){
        this.age = age;
        this.name = name;
    }
    void show(){
        System.out.println("Hello Mr. "+name+" You are now "+age+" Years old");
    }
}
public class lec_2 {
    public static void main(String[] args){

        Students s = new Students();


        Students s1 = new Students(20,"Abhinav");
        s1.show();
    }
}
