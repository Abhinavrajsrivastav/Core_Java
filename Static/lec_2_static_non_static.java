package Static;
  class God{
    static String name = "Shri Ram";

    static void address(){
        System.out.println(" Ayodhya");
        String name2 = "Arjun";
        System.out.println(name2);
    }

    String name1 = "Bhola";

    void address1(){
        System.out.println(" Varansi");
    }
}
public class lec_2_static_non_static {
    public static void main(String[] args ){
        God g1 = new God();
        System.out.print(g1.name1);
        g1.address1();

        System.out.print(God.name);
        God.address();


    }
}
