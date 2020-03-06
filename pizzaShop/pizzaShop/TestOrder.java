package pizzaShop;

public class TestOrder 
{
	public static void main(String[] args)
	{
		
		
		 Pizza pizza1 = new Pizza("Margherita", new String[] { "cheese, ", "tomato" }, 5.00);
		 Pizza pizza2 = new Pizza("Hawaian Heat", new String[] { "cheese, ", "tomato, ", "ham, ", "pineapple" }, 6.50);
		 Pizza pizza3 = new Pizza("Mushroom Madness", new String[] { "cheese, ", "tomato, ", "mushroom, " }, 6.00);
		 
		 Pizza[] pizzas = {pizza1, pizza2, pizza3};
		 
		Customer c1 = new Customer("Sam Wilcock, ", "Cherry Tree Lane");
		

		
		Order o1 = new Order(c1, pizzas);
		
		System.out.println(o1.toString());
		
	}
}
