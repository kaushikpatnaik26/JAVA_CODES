package practice;

import java.util.Scanner;

public class num_of_digits {

    public static void count(int x) {
        int count = 1;
        while (x > 0) {
            x = x / 10;
            if (x != 0) {
                count += 1;
            }

        }
        System.out.println("The number of digits in the number is: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = sc.nextInt();
        count(a);
        sc.close();

    }
}