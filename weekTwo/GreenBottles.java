package weekTwo;

public class GreenBottles 
{
	public static void main(String[] args) throws InterruptedException
	{
		for(int i=10; i >=2; i = i-1)
		{
		System.out.println( i +" Green Bottles hanging on the wall");
		Thread.sleep(2000);
		System.out.println( i + " Green Bottles hanging on the wall");
		Thread.sleep(2000);
		System.out.println("And if one green bottle should accidentally fall");
		Thread.sleep(2000);
		System.out.println("There'll be " + (i-1) + " Green Bottles hanging on the wall");
		Thread.sleep(2000);
		}
		
		for(int i = 2; i>=1; i = i-1)
		{
			System.out.println( i +" Green Bottle hanging on the wall");
			Thread.sleep(2000);
			System.out.println( i + " Green Bottle hanging on the wall");
			Thread.sleep(2000);
			System.out.println("And if one green bottle should accidentally fall");
			Thread.sleep(2000);
			System.out.println("There'll be " + (i-1) + " Green Bottle hanging on the wall");
			Thread.sleep(2000);
		}
	}

}