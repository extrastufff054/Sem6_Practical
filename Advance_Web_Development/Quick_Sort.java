import java.util.Arrays;
import java.util.Scanner;

class Quick_Sort {
    // Method to find the partition position
    static int partition(int array[], int low, int high) {
        // Choose the rightmost element as pivot
        int pivot = array[high];
        // Pointer for greater element
        int i = (low - 1);

        // Traverse through all elements
        // Compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                // If element smaller than pivot is found
                // Swap it with the greater element pointed by i
                i++;
                // Swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the position from where partition is done
        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            // Find pivot element such that
            // Elements smaller than pivot are on the left
            // Elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // Recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // Recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.println("Enter the elements of the array:");
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(data));

        // Call quickSort() on array data
        quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}

