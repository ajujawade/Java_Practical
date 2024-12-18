import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

    // Method to manually sort the array in ascending order
    public static void manualSortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Method to manually sort the array in descending order
    public static void manualSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Sample array
        int[] manualArray = {7, 2, 9, 4, 1, 6};
        Integer[] builtInArray = {7, 2, 9, 4, 1, 6};

        System.out.println("Original Array: " + Arrays.toString(manualArray));

        // 1. Manual Ascending Sort
        manualSortAscending(manualArray);
        System.out.println("Manual Ascending Sort: " + Arrays.toString(manualArray));

        // 2. Manual Descending Sort
        manualSortDescending(manualArray);
        System.out.println("Manual Descending Sort: " + Arrays.toString(manualArray));

        // 3. Built-in Ascending Sort
        Arrays.sort(builtInArray);
        System.out.println("Built-in Ascending Sort: " + Arrays.toString(builtInArray));

        // 4. Built-in Descending Sort
        Arrays.sort(builtInArray, Collections.reverseOrder());
        System.out.println("Built-in Descending Sort: " + Arrays.toString(builtInArray));
    }
}
