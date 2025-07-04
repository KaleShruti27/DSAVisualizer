package Sorting;

import java.util.Arrays;

public class MergeSort {
    public void sortAndVisualize(int[] arr) {
        System.out.println("Initial Array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Final Sorted Array: " + Arrays.toString(arr));
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        System.out.println("Dividing: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);

        System.out.println("Merged [" + left + " to " + right + "]: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int t = 0; t < temp.length; t++) {
            arr[left + t] = temp[t];
        }
    }
}


