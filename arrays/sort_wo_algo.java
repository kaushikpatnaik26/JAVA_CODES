package arrays;

import java.util.Arrays;

public class sort_wo_algo {
    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        System.out.print("Real array : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        Arrays.sort(arr);

        System.out.println("");
        System.out.print("Sorted array : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }

    }

}
