package pizzaShop;

public class Burger extends Food
{

		  private String [] filling;
		
		  public Burger(String reqName, String [] reqFilling, double reqPrice)
		  {
			  
			super(reqName, reqPrice);
		    filling = reqFilling;
		  }

		  public String[] getToppings()
		  {
		    return filling;
		  }

		  
		  public String toString()
		  {
			  String topping ="";
			  for(int i = 0; i < filling.length; i++)
			  {
				  topping += filling[i] + ", ";
			  }
			  return super.getName() + ", which contains " + topping + "for the price of £" + super.getPrice() + "\n";

		  }
}