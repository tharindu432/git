import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithems {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray(1000);

        long startTime, endTime;

        // Insertion sort
        startTime = System.nanoTime();
        insertionSort(Arrays.copyOf(arr, arr.length));
        endTime = System.nanoTime();
        System.out.println("Insertion sort time (best case): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        insertionSort(Arrays.copyOf(arr, arr.length));
        endTime = System.nanoTime();
        System.out.println("Insertion sort time (average case): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        insertionSort(reverseArray(arr));
        endTime = System.nanoTime();
        System.out.println("Insertion sort time (worst case): " + (endTime - startTime) + " ns");

        // Selection sort
        startTime = System.nanoTime();
        selectionSort(Arrays.copyOf(arr, arr.length));
        endTime = System.nanoTime();
        System.out.println("Selection sort time (best case): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        selectionSort(Arrays.copyOf(arr, arr.length));
        endTime = System.nanoTime();
        System.out.println("Selection sort time (average case): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        selectionSort(reverseArray(arr));
        endTime = System.nanoTime();
        System.out.println("Selection sort time (worst case): " + (endTime - startTime) + " ns");

        // Bubble sort
        startTime = System.nanoTime();
        bubbleSort(Arrays.copyOf(arr, arr.length));
        endTime = System.nanoTime();
        System.out.println("Bubble sort time (best case): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        bubbleSort(Arrays.copyOf(arr, arr.length));
        endTime = System.nanoTime();
        System.out.println("Bubble sort time (average case): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        bubbleSort(reverseArray(arr));
        endTime = System.nanoTime();
        System.out.println("Bubble sort time (worst case): " + (endTime - startTime) + " ns");
    }
}



