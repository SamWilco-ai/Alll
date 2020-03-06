package pizzaShop;

/*
 * A class to represent an order placed by a customer at a pizza shop
 * the class will calculate the total cost of the order based on the pizzas 
 * that have been requested 
 */

public class Order
{
  // the customer placing the order
  private Customer customer;

  // the pizzas that have been ordered
  private Pizza[]  pizzas;
  
  // Burgers
  private Burger[] burgers;

  // the total price for all the pizzas
  private double   totalPrice;

  //the main constructor for an order. Only requires customer and a list of 
  // pizzas as total price will be calculated
  public Order(Customer reqCustomer, Pizza[] reqPizzas)
  {
    customer = reqCustomer;
    pizzas = reqPizzas;
    
    //calculate total price based on price of each pizza
    totalPrice = 0.0;
    for (Pizza pizza : pizzas)
    {
      totalPrice += pizza.getPrice();
    }
  }
  
  public Order(Customer reqCustomer, Burger[] reqBurger)
  {
    customer = reqCustomer;
    burgers = reqBurger;
    
    //calculate total price based on price of each pizza
    totalPrice = 0.0;
    for (Burger burger : burgers)
    {
      totalPrice += burger.getPrice();
    }
  }
  

//get the object referring to the customer
  public Customer getCustomer()
  {
    return customer;
  }

  //get the pizzas that have been ordered
  public Pizza[] getPizzas()
  {
    return pizzas;
  }
  
  public Burger[] getBurger()
  {
	  return burgers;
  }

  //get the total price of this order
  public double getTotalPrice()
  {
    return totalPrice;
  }
  
  public String toString()
  {
	  String pizuh ="";
	  
	  for(int i = 0; i < pizzas.length; i++)
	  {
		  pizuh += "-" + pizzas[i];
		  
	  }
	  
	  return "Order For: " + customer  +"\nOrdered:\n" + pizuh + "The total will be: £" + totalPrice +"\n" +"\n";

  }
  

  
}
