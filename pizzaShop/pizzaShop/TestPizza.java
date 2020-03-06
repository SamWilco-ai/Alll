package pizzaShop;


public class TestPizza 
{

	public static void main(String[] args) 
	{
		String[] topppings = {"Pepperoni", "Chicken" , "Fajita"};
		Pizza pizza1 = new Pizza("Pepperoni Passion", topppings , 10.50);
				
		System.out.println(pizza1);
	}

}
