package pizzaShop;

public class TestFood {

	public static void main(String[] args) 
	{
		String[] topppings = {"Pepperoni, ", "Chicken, " , "Fajita, "};
		Pizza pizza1 = new Pizza("Pepperoni Passion", topppings , 10.50);
		Burger burger1 = new Burger("Burger Passion", topppings, 15);
				
		System.out.println(pizza1);
		System.out.println(burger1);

	}

}
