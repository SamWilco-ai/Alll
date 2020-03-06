package weekFour;

public class PrintTableTwo {

	public static void main(String[] args) 
	{
		dash();
		System.out.println("| a | b | c | d | e |");
		dosh();
		dash();
		System.out.println("| 1 | 2 | 3 | 4 | 5 |");
		dosh();
		dash();
		System.out.println("| i |ii |iii| iv| v |");
		dosh();
		dash();
		System.out.println("| r | o | y | g | b |");
		dosh();
		dash();
		System.out.println("|jan|feb|mar|apr|may|");
		dosh();
		dash();
		System.out.println("|gen|exo|lev|num|deu|");
		dosh();
	}
	
	public static String dash()
	{
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		return null;
	}
	
	public static String dosh()
	{
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		return null;
		
	}

}
