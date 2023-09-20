package Strings;

public class String_capacityvs_length {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();// builder == buffer
        System.out.println(sb.capacity());

        StringBuffer s1 = new StringBuffer("Abhi");
        System.out.println(s1.capacity());

        StringBuffer s2 = new StringBuffer();
        s2.append("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(s2.capacity());
    }
}
