package weekFive;

import java.util.Scanner;

public class CalculatorUtils {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		System.out.println(add(a,b));
		
		System.out.println(subtract(a,b));
		
		System.out.println(multiply(a,b));
		
		System.out.println(divide(a,b));
		
		scanner.close();

	}
	
	public static double add(double a, double b)
	{
		double c = a + b;
		return c;
	}

	public static double subtract(double a, double b)
	{
		double c = a - b;
		return c;
	}

	public static double multiply(double a, double b)
	{
		double c = a * b;
		return c;
	}

	public static double divide(double a, double b)
	{
		double c = a / b;
		return c;
	}


}
