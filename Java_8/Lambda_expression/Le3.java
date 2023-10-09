package Java_8.Lambda_expression;

//many parameter lambda expression

interface C{
    void show(String s, String t);
}

public class Le3 {
    public static void main(String[] args) {
        C obj = (s,t) -> System.out.println("Hello "+s+" and "+t);
        obj.show("Abhinav","Kiara");
    }
}
