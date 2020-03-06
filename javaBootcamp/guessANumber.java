package javaBootcamp;
import java.util.Scanner;

public class guessANumber 
{

	public static void main(String[] args) 
	{
		
		while(true)
		{
			
		Scanner scanner = new Scanner(System.in);

		int randomNumber = (int)(Math.random()*10) + 1;
		System.out.println("Choose a number");
		int chosenNum = scanner.nextInt();
		
		if(chosenNum == randomNumber)
		{
			System.out.println("Winner");
		}
		
		else if(chosenNum != randomNumber)
		{
			System.out.println("Lose");
		}
		
		scanner.close();
		}
		
	}

}
