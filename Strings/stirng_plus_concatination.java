package Strings;

public class stirng_plus_concatination {
    public static void main(String[] args){
        //created in heap area not in SCP
        String s1 = "pw";
        String s2 = "pw"+"skills";
        String s3 = "pw"+"skills"+"java";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //created at SCP area
        String s4 = s1+s2+s3;
        System.out.println(s4);
    }
}
