package weekThree;

import java.util.Scanner;

public class LotteryNumbers 
{

	public static void main(String[] args) 
	{					
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number from 1-99");
		int number = scanner.nextInt();
		while (number < 1 || number > 99)
		{
			System.out.println("re-enter");
			number = scanner.nextInt();
		}
		
		System.out.println("Please enter a number from 1-99");
		int number1 = scanner.nextInt();
		while (number1 < 1 || number1 > 99)
		{
			System.out.println("re-enter");
			number1 = scanner.nextInt();
		}
		
		System.out.println("Please enter a number from 1-99");
		int number2 = scanner.nextInt();
		while (number2 < 1 || number2 > 99)
		{
			System.out.println("re-enter");
			number2 = scanner.nextInt();
		}
		
		System.out.println("Please enter a number from 1-99");
		int number3 = scanner.nextInt();
		while (number3 < 1 || number3 > 99)
		{
			System.out.println("re-enter");
			number3 = scanner.nextInt();
		}
		
		if((number == Math.random()) && (number1 == Math.random()) && (number2 == Math.random()) && (number3 == Math.random()))
		{
			System.out.println();
			System.out.println("You win");
		}
		
		else 
		{
			System.out.println("You lose");
		}

		scanner.close();
	}

}
