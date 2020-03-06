package weekSeven;

public class TimesTablesArray 
{

	public static void main(String[] args)
	{
		int size = 12;
		int number = 5;
		
		int[] timesTable = getTimesTable(size, number);
		
		printArray(timesTable);
	}

	private static int[] getTimesTable(int reqSize, int reqNumber)
	{
		int[] timesTable = new int[reqSize];
		
		for(int i = 0; i < reqSize; i++)
		{
			int times = (i+1)*reqNumber;
			timesTable[i] = times;
		}
		
		return timesTable;
	}
	
	private static void printArray(int[] integerArray) 
	{
		for (int i = 0; i < integerArray.length; i++)
		{
			int num = integerArray[i];
			System.out.println(num);
		}
	}


}
