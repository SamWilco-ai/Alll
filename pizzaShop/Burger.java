package pizzaShop;

public class Burger
{
	
		  //the name of the burger
		  private String name;
		  
		  //the toppings required by this burger
		  private String [] filling;
		  
		  //the price for this burger
		  private double price;
		  
		  //main constructor - must supply name, toppings and price
		  public Burger(String reqName, String [] reqFilling, double reqPrice)
		  {
		    name = reqName;
		    filling = reqFilling;
		    price = reqPrice;
		  }

		  //get the name of the burger
		  public String getName()
		  {
		    return name;
		  }

		  //get the toppings required for this burger
		  public String[] getToppings()
		  {
		    return filling;
		  }

		  //get the price of this burger
		  public double getPrice()
		  {
		    return price;
		  }
		  
		  public String toString()
		  {
			  String topping ="";
			  for(int i = 0; i < filling.length; i++)
			  {
				  topping += filling[i] + ", ";
			  }
			  return name + ", which contains " + topping + "for the price of £" + price + "\n";

		  }
}