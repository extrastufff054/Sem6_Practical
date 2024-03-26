import java.util.Scanner;

public class Area_Rectangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the width of the rectangle : ");
		int width = sc.nextInt();
		System.out.print("Enter the length of the rectangle : ");
		int length = sc.nextInt();
		System.out.print("------------------------------------------------------------------");
		int area = length * width;
		System.out.print("The area of rectangle is "+ area);

	}
}
