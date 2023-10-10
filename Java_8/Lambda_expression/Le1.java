package Java_8.Lambda_expression;

//Zeo parameter lambda expression

interface A{
    void show();
}
public class Le1 {
    public static void main(String[] args) {
        //Lambda expression
        A obj = () -> System.out.println("Hello");
        obj.show();
    }
}
