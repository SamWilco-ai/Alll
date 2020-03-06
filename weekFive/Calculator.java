package weekFive;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
				
		Scanner stringScanner = new Scanner(System.in);

		while(loop)
		{
		System.out.println("Enter 2 numbers");
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		System.out.println("what function?");
		
		
		
		String function = stringScanner.nextLine();
		
		if(function.contains("add")||function.contains("+"))
		{
			System.out.println(CalculatorUtils.add(a, b));
			System.out.println("Finish? (y/n)");
			
			String y_n = stringScanner.nextLine();
			
			if(y_n.contains("y"))
			{
				loop = false;
			}
		}
		
		else if(function.contains("subtract")||function.contains("-"))
		{
			System.out.println(CalculatorUtils.subtract(a, b));
			System.out.println("Finish? (y/n)");
			
			String y_n = stringScanner.nextLine();
			
			if(y_n.contains("y"))
			{
				loop = false;
			}
		}
		
		else if(function.contains("multiply")||function.contains("*")||function.contains("x"))
		{
			System.out.println(CalculatorUtils.multiply(a, b));
			System.out.println("Finish? (y/n)");
			
			String y_n = stringScanner.nextLine();
			
			if(y_n.contains("y"))
			{
				loop = false;
			}
		}
		
		else if(function.contains("divide")||function.contains("/")||function.contains("Divide"))
		{
			System.out.println(CalculatorUtils.divide(a, b));
			System.out.println("Finish? (y/n)");
			
			String y_n = stringScanner.nextLine();
			
			if(y_n.contains("y"))
			{
				loop = false;
			}
		}
		}
		scanner.close(); 
		stringScanner.close();
	}

}
