import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the type of interest calculation:");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();
        System.out.println("Enter the rate of interest:");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time period:");
        double time = scanner.nextDouble();

        switch (choice) {
            case 1: // Simple Interest
                double simpleInterest = (principal * time * rate) / 100;
                System.out.println("Simple Interest: " + simpleInterest);
                break;
            case 2: // Compound Interest
                double compoundInterest = principal * Math.pow(1 + rate / 100, time) - principal;
                System.out.println("Compound Interest: " + compoundInterest);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

