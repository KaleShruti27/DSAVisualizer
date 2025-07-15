package Sorting;
import java.util.*;

public class SelectionSort {
    public List<int[]> getSortingSteps(int[] input) {
        List<int[]> steps = new ArrayList<>();
        int[] arr = Arrays.copyOf(input, input.length);
        steps.add(Arrays.copyOf(arr, arr.length));

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            steps.add(Arrays.copyOf(arr, arr.length));
        }

        return steps;
    }
}
