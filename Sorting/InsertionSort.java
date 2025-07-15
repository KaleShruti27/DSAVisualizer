package Sorting;
import java.util.*;

public class InsertionSort {
    public List<int[]> getSortingSteps(int[] input) {
        List<int[]> steps = new ArrayList<>();
        int[] arr = Arrays.copyOf(input, input.length);
        steps.add(Arrays.copyOf(arr, arr.length));

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                steps.add(Arrays.copyOf(arr, arr.length));
            }

            arr[j + 1] = key;
            steps.add(Arrays.copyOf(arr, arr.length));
        }

        return steps;
    }
}
