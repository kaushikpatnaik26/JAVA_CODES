package practice;

public class bubblesort {
    static int[] sortaray(int a[]) {   
        for(int i=0; i <a.length -1; i++) {
            for(int j = 0 ; j < a.length -i -1 ; j++ ){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,4,2,4,6,8,0,3,2,6,47};
        int sorted[] = sortaray(arr);
        System.out.print("Sored array is : " );

        for(int i=0; i<sorted.length; i++){
            System.out.print(sorted[i]+ " , ");
        }
    }
}
// package practice;

// public class bubblesort {

//     public static void main(String[] args) {
//         int arr[] = { 10 , 11 };
//         System.out.println(arr.length - 1 );
//     }
// }