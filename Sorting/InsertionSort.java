package Sorting;
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] myArray = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Original array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        insertionSort(myArray);
        System.out.println("\nSorted array using Insertion Sort:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}