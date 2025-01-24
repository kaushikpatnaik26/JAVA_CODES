

package leet_code_practice;

import java.util.*;

public class merge_sorted {

    public static void main(String[] args) {
        int a[] = { 2, 3, 5, 2, 0, 0, 0, 0 };
        int b[] = { 6, 2, 8, 7 };
        int merged[] = new int[a.length + b.length];

        for (int i = 0; i < a.length - 1; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }
        System.out.print("Merged arrays is :  ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        {
            Arrays.sort(merged);
            System.out.println("The merged sorted arrays is : ");
            for (int num : merged) {
                System.out.print(num + " ");
            }
        }
    }
}
