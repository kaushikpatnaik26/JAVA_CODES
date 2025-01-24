// package practice;

// public class sortarray {

//     public static void sortarray(int a[])
//     {
//         for(int i=0; i<a.length; i++)
//         {
//            for(int j=i+1; j<a.length; j++) 
//            {
//             if (a[i]>a[j])
//             {
//                 int temp = a[i];
//                 a[i] = a[j];
//                 a[j] = temp;
//             }
//            }
//         }
//     }
//     public static void main(String[] args) {
//         int[] a = {1, 24, 9, 6, 2};
//         int b[]= {1,9,6,8,4,6,7,5,4,5,7,8,};
//         sortarray(a);
//         sortarray(b);
//         System.out.println("the sorted array 1 is: ");
        
//         for(int i=0; i<a.length; i++)
//         {
//             System.out.print(" " + a[i]);
//         }
        
//         System.out.println("");

//         System.out.println("the sorted array 2 is: ");
        
//         for(int i=0; i<b.length; i++)
//         {
//             System.out.print(" " + b[i]);
//         }
//     }
// }