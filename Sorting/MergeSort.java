package Sorting;
import java.util.*;

public class MergeSort {
    private List<int[]> steps;

    public List<int[]> getSortingSteps(int[] input) {
        int[] arr = Arrays.copyOf(input, input.length);
        steps = new ArrayList<>();
        steps.add(Arrays.copyOf(arr, arr.length));
        mergeSort(arr, 0, arr.length - 1);
        return steps;
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
            steps.add(Arrays.copyOf(arr, arr.length));
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        while (i <= mid) arr[k++] = temp[i++];
        while (j <= right) arr[k++] = temp[j++];
    }
}
