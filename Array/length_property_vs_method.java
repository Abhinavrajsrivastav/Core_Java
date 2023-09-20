public class length_property_vs_method {
    public static void main(String[] args){
        int a[] = {1,2,3,4};
        //Length is a property used for calculating
        // length of an array type of class
        System.out.println(a.length);

        int[][] b = {
                {1,2,3,4},{1,2,3},{1,2}
        };
        System.out.println(b[2].length);

        String name = "Abhinav";
        //Length() is a method used for calculating
        // length of a String type of class
        System.out.println(name.length());
    }
}
