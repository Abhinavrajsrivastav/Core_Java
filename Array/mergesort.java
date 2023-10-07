public class mergesort {
        public static void main(String[] args) {
            int[] arr = { 12, 11, 13, 5, 6, 7 };

            System.out.println("Original Array:");
            printArray(arr);

            mergeSort(arr, 0, arr.length - 1);

            System.out.println("\nSorted Array:");
            printArray(arr);
        }

        // Merge two subarrays of arr[]
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
        public static void merge(int[] arr, int l, int m, int r)  {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;

            // Create temporary arrays
            int[] left = new int[n1];
            int[] right = new int[n2];

            // Copy data to temporary arrays left[] and right[]
            for (int i = 0; i < n1; i++) {
                left[i] = arr[l + i];
            }
            for (int j = 0; j < n2; j++) {
                right[j] = arr[m + 1 + j];
            }

            // Merge the temporary arrays
            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements of left[] if any
            while (i < n1) {
                arr[k] = left[i];
                i++;
                k++;
            }

            // Copy remaining elements of right[] if any
            while (j < n2) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        // Main function that sorts arr[l..r] using merge()
        public static void mergeSort(int[] arr, int l, int r) {
            if (l < r) {
                // Find the middle point
                int m = l + (r - l) / 2;

                // Sort first and second halves
                mergeSort(arr, l, m);
                mergeSort(arr, m + 1, r);

                // Merge the sorted halves
                merge(arr, l, m, r);
            }
        }

        // Utility function to print an array
        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
