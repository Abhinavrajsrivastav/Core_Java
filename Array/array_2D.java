public class array_2D {

    public static void main(String[] args){
        int marks[][] = new int[3][2];
        marks[0][0] = 100;
        marks[0][1] = 89;
        marks[1][0] = 77;
        marks[1][1] = 87;
        marks[2][0] = 90;
        marks[2][1] = 96;

        for(int i=0 ; i<3;i++){
            for(int j=0 ;j<2;j++){
                System.out.println(marks[i][j]);
            }
        }
    }
}
