import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be reversed:");
        String input = scanner.nextLine();
        scanner.close();

        // Convert String to character array
        char[] charArray = input.toCharArray();

        // Reverse the array
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
	
    }
}

