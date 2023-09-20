package Strings;

public class string_concat {
    public static void main(String[] args){
        //with new keyword
        String s1 = new String("pw");
        s1 = s1.concat("skills");
        System.out.println(s1);

        //without new keyword
        String a1 = "pw";
        String a2 = a1.concat("skills");
        String a3 = new String("pwjava");
        a3 = a3.concat("skills");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
