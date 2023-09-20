package Constructor;
class Student{
    private int age;
    private String name;

     Student(int age,String name){
       this.age = age;
       this.name = name;
    }

    void show(){
        System.out.println("Hello Mr. "+name+" You are now "+age+" Years old");
    }
}
public class lec_1 {
    public static void main(String[] args){
        Student s1 = new Student(20,"Ram");
        s1.show();
    }
}
