import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class list_to_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements for the list:");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.println("Enter the elements of the list:");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextLine());
        }

        // Convert list to array
        String[] array = new String[list.size()];
        list.toArray(array);

        System.out.println("List: " + list);
        System.out.println("Array: " + Arrays.toString(array));
    }
}

