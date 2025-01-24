package arrays;

public class selectionsort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " , ");
        }

        selectionSort(arr);

        System.out.print("\nSorted array: ");
        for (int num : arr) {
            System.out.print(num + " , ");
        }
    }
}
