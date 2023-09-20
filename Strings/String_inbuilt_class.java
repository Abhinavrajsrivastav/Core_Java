package Strings;

public class String_inbuilt_class {
    public static void main(String[] args){
        String name = "abhinav raj Srivastav";

//        1.split()
        String[] result = name.split(" ");
        for(String str : result){
            System.out.println(str+",");
        }
//        2. compareTo()
        String s1 = "Abhi";
        String s2 = "Abhi";
        System.out.println(s1.compareTo(s2));

//        3.length()
        System.out.println(s1.length());

//        4. replace('whom','which');
        System.out.println(s1.replace('A','K'));

//        5. substring()
        System.out.println(s1.substring(0,3));

//        6. equals()
        System.out.println(s1.equals(s2));

//        7. contains("?")
        String myName = "Abhinav Raj Srivastava";
        System.out.println(myName.contains("Abhinav"));

//        8. indexOf('?');
        System.out.println(myName.indexOf('n'));

//        9. charAt(?);
        System.out.println(myName.charAt(0));

//        10. concat();
        String n1 = "Abhinav";
        String n2 = "Raj";
        System.out.println(n1.concat(n2));

//        11. toLowerCase();

//        12. toUpperCase();

//        13. startWith("?");
        System.out.println(myName.startsWith("Abhinav"));

//        14. setCharAt('index ?','Char ?');
        StringBuffer sb2 = new StringBuffer("Sachin");
           sb2.setCharAt('2','E');
        System.out.println(sb2);
//        14. endWith("?");

//        15. isEmpty();
    }
}
