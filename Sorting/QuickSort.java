package Sorting;
import java.util.*;

public class QuickSort {
    private List<int[]> steps;

    public List<int[]> getSortingSteps(int[] input) {
        int[] arr = Arrays.copyOf(input, input.length);
        steps = new ArrayList<>();
        steps.add(Arrays.copyOf(arr, arr.length));
        quickSort(arr, 0, arr.length - 1);
        return steps;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            steps.add(Arrays.copyOf(arr, arr.length));
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                steps.add(Arrays.copyOf(arr, arr.length));
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        steps.add(Arrays.copyOf(arr, arr.length));
        return i + 1;
    }
}
