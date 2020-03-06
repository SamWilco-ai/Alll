package weekSeven;

public class TextProcessing 
{

	public static void main(String[] args)
	{
		String tester = "I Love Object Oriented Programming";
		
		char test = 'o';
		
		System.out.println(timesCharCapOccurs(tester, test));
	}
	
	public static int timesCharOccurs(String str, char character)
	{
		int counter = 0;
		
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++)
		{
			if(character==charArray[i])
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	
	public static int timesCharCapOccurs(String str, char character)
	{
		int counter = 0;
		
		str = str.toLowerCase();
		
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++)
		{
			if(character==charArray[i])
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	public static void printArray(int[] integerArray)
	{
		for(int i = 0; i < integerArray.length; i++)
		{
			int number = integerArray[i];
			System.out.println(number);
		}
	}
	
}
