package Java_8.Lambda_expression;

//One parameter lambda expression
interface B{
    void show(String s);
}

public class Le2 {
    public static void main(String[] args){
        B obj = s -> System.out.println("Hello "+s);
        obj.show("Abhishek");
    }   
}
