package weekTwo;
import java.util.Scanner;

public class NestedForLoop 
{

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		String star = "*";
		int howManyLines = scanner.nextInt();
		
		for(int j = 0; j <= howManyLines; j++)
		{
			for(int i = 0; i < 6; i++ )
			{
				System.out.println(star);
				star = star + "*";
			}
		}
		
		scanner.close();
		
	}

}
