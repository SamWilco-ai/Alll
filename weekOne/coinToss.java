package weekOne;
import java.util.Random;

public class coinToss {

	public static void main(String[] args) throws InterruptedException 
	{
		
		while(true)
		{
		Random rand = new Random();
		
		double coinToss = rand.nextDouble();
		
		if(coinToss < 0.5)
		{
			System.out.println(coinToss);
			Thread.sleep(2000);
			System.out.println("Heads");
			Thread.sleep(2000);

		}
		
		else if(coinToss>=0.5)
		{
			System.out.println(coinToss);
			Thread.sleep(2000);
			System.out.println("Tails");
			Thread.sleep(2000);

		}
		
		}
	}

}
