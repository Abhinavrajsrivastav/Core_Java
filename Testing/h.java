package Testing;

import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        //optimum and best code for calculating sum of multiples of 3 or 5 from 1 to n
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int k = n - 1;
        int sum3 = k / 3;
        sum3 = 3 * sum3 * (sum3 + 1) / 2;
        int sum5 = k / 5;
        sum5 = 5 * sum5 * (sum5 + 1) / 2;
        int sum15 = k / 15;
        sum15 = 15 * sum15 * (sum15 + 1) / 2;

        sum = sum3 + sum5 - sum15;
        System.out.println(sum);
    }
}
