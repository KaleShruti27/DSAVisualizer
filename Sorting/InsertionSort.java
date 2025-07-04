package Sorting;

public class InsertionSort {
    public void sortAndVisualize(int[] arr) {
        int n = arr.length;
        System.out.println("Initial Array: " + arrayToString(arr));

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + arrayToString(arr));
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
