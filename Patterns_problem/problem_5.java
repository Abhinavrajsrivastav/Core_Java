public class problem_5 {
    public static void main(String[] args){
        for(int i =0; i<7;i++){
            for(int j=0;j<7;j++){
                if(i==j||i==6-j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
