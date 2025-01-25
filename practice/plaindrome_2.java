package practice;

import java.util.*;

public class palin {

    public static boolean isPalindrome(String x) {
        int left = 0;
        int right = x.length() - 1;

        while (left > right) {
            if (x.charAt(left) != x.charAt(right)) {
                return false;
            }
            left++;
            right++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entere a string/number to check if it is a Palindrome or not:  ");
        String val = sc.nextLine();
        isPalindrome(val);
        if (isPalindrome(val)) {
            System.out.println("The Entered string is a palindrome");
        } else {
            System.out.println("The entered string is not a plaindrome");
        }
        sc.close();
    }
}
