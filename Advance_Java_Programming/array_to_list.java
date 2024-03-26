import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class array_to_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements for the array:");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.println("Enter the elements of the array:");
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextLine();
        }

        // Convert array to list
        List<String> list = new ArrayList<>(Arrays.asList(array));

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("List: " + list);
    }
}

