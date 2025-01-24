package practice;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        int rev =0;
        
        while(x!=0)
        {
            int last =  x%10;
            int y = x/10;
            rev = y*10+last; 
        
        if (x == rev)
        {
            System.out.println("palindrome");
            break;
        }
        else{
            System.out.println("not palindrome");
            break;
        }
       
    }  sc.close(); 
    }
}
