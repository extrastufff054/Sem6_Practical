import java.util.Scanner;

public class simple_calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		
		System.out.println("Choose operation : \t\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Modulus \n");
		int n = sc.nextInt();
		switch(n)
		{
			case 1 :
				System.out.println("Addition of "+a+" and "+b+"is : "+(a+b));
				break;

			case 2 :
				System.out.println("Subtraction of "+a+" and "+b+"is : "+(a-b));
				break;

			case 3 :
				System.out.println("Multiplication of "+a+" and "+b+"is : "+(a*b));
				break;

			case 4 :
				System.out.println("Division of "+a+" and "+b+"is : "+(a/b));
				break;

			case 5 :
				System.out.println("Modulus of "+a+" and "+b+"is : "+(a%b));
				break;

			default :
				System.out.println("Error!");
				break;


		}
	}
}
