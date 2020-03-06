package javaBootcamp;
import java.util.Scanner;
public class timesTables 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scanner.nextInt();
		
		for(int i = 1; i <=12; i++ )
		{
		System.out.println(i + " x " + number + " = " + (i * number));
		}

		
		scanner.close();
	}

}
