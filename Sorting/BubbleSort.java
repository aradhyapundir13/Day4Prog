package Sorting;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] myArray = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Original array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        bubbleSort(myArray);
        System.out.println("\nSorted array using Bubble Sort:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}