package pizzaShop;


public class Pizza extends Food
{
  private String [] toppings;
  

  public Pizza(String reqName, String [] reqToppings, double reqPrice)
  {
	  
	  super(reqName, reqPrice);
	  toppings = reqToppings;
  }

  public String[] getToppings()
  {
    return toppings;
  }

  
  public String toString()
  {
	  String topping ="";
	  for(int i = 0; i < toppings.length; i++)
	  {
		  topping += toppings[i] + ", ";
	  }
	  return super.getName() + ", which contains " + topping + "for the price of £" + super.getPrice() + "\n";

  }
}
