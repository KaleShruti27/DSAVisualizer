package Sorting;

public class BubbleSort {
    public void sortAndVisualize(int[] arr) {
        int n = arr.length;
        System.out.println("Initial Array: " + arrayToString(arr));
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
