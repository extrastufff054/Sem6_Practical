import java.util.Scanner;

public class BinarySearch {
    // Method to perform binary search
    private static int binarySearch(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high) {
            int middleIndex = (low + high) / 2;
            int middleElement = array[middleIndex];
            
            if (element == middleElement) {
                return middleIndex;
            }
            if (element < middleElement) {
                high = middleIndex - 1;
            } else {
                low = middleIndex + 1;
            }
        }
        
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.println("Enter the elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int element = scanner.nextInt();
        scanner.close();

        int result = binarySearch(array, element);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

