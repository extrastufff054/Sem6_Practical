import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the desired number");
        int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

