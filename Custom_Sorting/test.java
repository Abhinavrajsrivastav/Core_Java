package Custom_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        List str1 = new ArrayList<>();

        for(int i = 0;i<str.length();i++){
            str1.add(str.charAt(i));
        }
        Collections.sort(str1);

        str = str1.toString();

        System.out.println("Sorted string is: "+str);
    }
}
