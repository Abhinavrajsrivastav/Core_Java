package Encapsulation;

class student{
    private int age;// Instance variable
    private String name; //Instance variable

    public void setData(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void show(){
        System.out.println("your name is "+name+" and your age is "+age);
    }
}
public class lec_2 {

    public static void main(String[] args){
      student s1 = new student();
      s1.setData(29,"Archit");
      s1.show();
    }
}

// local variables are given more priority than the instance
// variable by the jvm at the time of variables in
// overlapping scopes where low-level-scope variable is overrides by the high-level-scope...