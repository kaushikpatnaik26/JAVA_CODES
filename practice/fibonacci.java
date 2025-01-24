package practice;
import java.util.*;
public class fibonacci {
    static int checkfibonacci(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i+1]==a[i]+a[i-1])
            {
                System.out.println("The array series is in fibonacci");
            }
            else{System.out.println("not fibinacci");}
        }
        return 0;
    }
    public static void main(String[] args) {
     System.out.println("enter an array of elements to check if fibonacci or not: ");   
     Scanner sc = new Scanner(System.in);
     System.out.print("enter number of total elements: ");
     int a= sc.nextInt();
     int b[] = new int[a];
     for(int i=1 ;i<a+1; i++)
     {
        System.out.print("Enter element "+i+ " : ");
        b[i] = sc.nextInt();
     }
     checkfibonacci(b);
     sc.close();
    }
    
    
}