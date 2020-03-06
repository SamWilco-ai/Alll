package weekThree;

import java.util.Scanner;

public class passwordChecker 
{

	public static void main(String[] args) 
	{
		{
			String password = "password";
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("please enter your password");
			String user = scanner.nextLine();

			while(!user.equals(password))
			{
				System.out.println("wrong try again");
				user = scanner.nextLine();
			}
			
			System.out.println("Correct");
			scanner.close();
			
		}
	}

}
