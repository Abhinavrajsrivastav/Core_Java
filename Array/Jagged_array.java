public class Jagged_array {
    public static void main(String[] args){
        int[][] a = {
                {1,2,3,4},{5,6},{6,7,8}
        };

//        #Declaring the size of the individual row
        a[0] = new int[4];
        a[1] = new int[2];
        a[2] = new int[3];

        for(int i=0; i<3; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
