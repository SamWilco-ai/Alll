package pizzaShop;

public class Food 
{
	  private String name;
	  
	  private double price;

	  
	  public Food(String reqName, double reqPrice) 
	  {
		  name = reqName;
		  price = reqPrice;
	  }

	public String getName()
	  {
	    return name;
	  }
	  
	  public double getPrice()
	  {
	    return price;
	  }
}
