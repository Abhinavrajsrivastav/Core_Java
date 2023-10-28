package Algorithms;

public class Backtracking {

    public static void backtracking(int[] arr, int[] data, int index, int i, int n, int r) {
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
            return;
        }
        if (i >= n) {
            return;
        }
        data[index] = arr[i];
        backtracking(arr, data, index + 1, i + 1, n, r); 
        backtracking(arr, data, index, i + 1, n, r);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] data = new int[3];
        int n = arr.length;
        int r = 2;
        int index = 0;
        int i = 0;
        backtracking(arr, data, index, i, n, r);
    }
}
