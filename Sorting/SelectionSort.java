package Sorting;

public class SelectionSort {
    public void sortAndVisualize(int[] arr) {
        int n = arr.length;
        System.out.println("Initial Array: " + arrayToString(arr));

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.println("Pass " + (i + 1) + ": " + arrayToString(arr));
        }

        System.out.println("Sorted Array: " + arrayToString(arr));
    }

    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}

