package weekOne;
import java.util.Scanner;

public class ListOfLists 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select a topic:");
		System.out.println("(a) Animals");
		System.out.println("(b) Fruit and Vegetables");
		System.out.println("(c) Celebrities");
		
		char choiceOne = scanner.nextLine().charAt(0);
		
		switch(choiceOne)
		{
		case 'a':
			System.out.println("You have selected Animals");
			System.out.println("Please Choose a sub category");
			System.out.println("(1) Mammals");
			System.out.println("(2) Birds");
			System.out.println("(3) Fish");
			
			int choiceOneTwo = scanner.nextInt();
			switch(choiceOneTwo)
			{
			case 1:
				System.out.println("You have selected mammals");
				System.out.println("You are a mammal");
				break;
			case 2:
				System.out.println("You have selected birds");
				System.out.println("Birds are boring");
				break;
			case 3:
				System.out.println("You have chosen Fish");
				System.out.println("Old Greg");
				break;
			}
			break;
			
		case 'b':
			System.out.println("You have selected Fruit and Vegetables");
			System.out.println("Please Choose a sub category");
			System.out.println("(1) Fruit");
			System.out.println("(2) Vegetables");
			System.out.println("(3) More");
			
			int choiceOneThree = scanner.nextInt();
			switch(choiceOneThree)
			{
			case 1:
				System.out.println("You have chosen Fruit");
				System.out.println("Oreos are fruit");
				break;
			case 2:
				System.out.println("You have chosen Vegetables");
				System.out.println("They dont exist");
				break;
			case 3:
				System.out.println("You have chosen more");
				System.out.println("You won this program");
				break;
			}
			break;
			
		case 'c':
			System.out.println("You have selected Celebrities");
			System.out.println("Please Choose a sub category");
			System.out.println("(1) TV");
			System.out.println("(2) Music");
			System.out.println("(3) Films");
			
			int choiceOneFour = scanner.nextInt();
			switch(choiceOneFour)
			{
			case 1:
				System.out.println("You have chosen TV");
				System.out.println("Brian Limond");
				break;
			case 2:
				System.out.println("Gerry Cinnamon");
				break;
			case 3:
				System.out.println("Who the fuck knows");
				break;
			}
			break;
			
			}
		scanner.close();
		
	
			
		}
	
}