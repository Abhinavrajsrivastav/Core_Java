package Strings;

public class String_new_without_new {
    static public void main(String[] args){
        //Without using new keyword
        String s1 = "pw";
        String s2 = "pw";

        // With using new keyword
        String s3 = new String("pwSkills");
        String s4 = new String("pwSkills");

        System.out.println(s1==s2);
        System.out.print(s3 == s4);
    }
}
