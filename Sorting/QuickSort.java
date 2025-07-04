package Sorting;

import java.util.Arrays;

public class QuickSort {
    public void sortAndVisualize(int[] arr) {
        System.out.println("Initial Array: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Final Sorted Array: " + Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            System.out.println("QuickSort called on: " + Arrays.toString(Arrays.copyOfRange(arr, low, high + 1)));
            int pivotIndex = partition(arr, low, high);
            System.out.println("After partition around pivot " + arr[pivotIndex] + ": " + Arrays.toString(arr));
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        System.out.println("  Pivot chosen: " + pivot);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                System.out.println("    Swapped " + arr[i] + " and " + arr[j] + ": " + Arrays.toString(arr));
            }
        }

        swap(arr, i + 1, high);
        System.out.println("  Swapped pivot to correct position: " + Arrays.toString(arr));
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
