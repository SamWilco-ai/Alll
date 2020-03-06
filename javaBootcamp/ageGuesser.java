package javaBootcamp;
import java.util.Scanner;

public class ageGuesser 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Scanner stringScanner = new Scanner(System.in);
		
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		
		System.out.println("You were born in " + (2020 - age));
		System.out.println("Correct?");
		String correct = stringScanner.nextLine();
		
		if(correct.equals("n"))
		{
			System.out.println(2020 - (age + 1));
			System.out.println("Correct now?");
			correct = stringScanner.nextLine();
			
			if(correct.equals("n"))
			{
				System.out.println("Liar");
				scanner.close();
			}
		}
		
		else if(correct.equals("y"))
		{
			System.out.println("cool");
		}
		
		stringScanner.close();
		
	}

}
