package pizzaShop;

public class TestCustomer 
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer("Sam Wilcock", "Cherry Tree Lane");
		Customer c2 = new Customer("Jim Jones", "Apple Tree Lane");
		Customer c3 = new Customer("Larry Smith", "Orange Tree Lane");
		Customer c4 = new Customer("Mike Williams", "Banana Tree Lane");
		Customer c5 = new Customer("Rory Koa", "Pear Tree Lane");
		
		System.out.println(c5.toString());
		System.out.println(c1.toString());

		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());


	}
}
