package Encapsulation;

class Studenti{
    private int age;
    private String Name;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

public class lec_3 {
    public static void main(String[] args){
        Studenti s1 = new Studenti();
        s1.setAge(29);
        int age = s1.getAge();
        System.out.println(age);
    }
}
