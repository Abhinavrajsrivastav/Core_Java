package Strings;

public class Immutable_string {
    
    public static void main(String[] args){
        String name = "Abhinav";
        System.out.print(name);

        String color = new String("Red");
        System.out.println(color);

        char[] array = {'a','b'};
        String ab = new String(array);
        System.out.println(ab);
    }

    
}
