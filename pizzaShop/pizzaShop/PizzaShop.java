package pizzaShop;

/*
 * A class to model a pizza shop - has a database of pizzas, customers and 
 * can recieve orders
 */

public class PizzaShop
{
  //the pizza database - all pizzas that can be ordered  
  private Pizza[] pizzasTest; //Test
  
  //Burgers
  private Burger[] burgers;

  
  //the customer database - all customers that are known to the system
  private Customer[] customersTest;//Test
  private InternetCustomer[] internetCustomers;

  private Food[] foody;
  

  //the orders that have been placed so far
  private Order[] orders;

  //a variable to track what the next order number will be
  private int orderNumber;

  public PizzaShop()
  {
    // load Pizzas (we could load these from a database using file io)
    
    Pizza samsTestPizza = new Pizza("Chicken Supreme", new String[]{"Chicken", "Chorizo", "Cheddar", "Peppers"}, 10.50);     //Test
    Pizza samsTestPizza1 = new Pizza("Meat Supreme", new String[]{"Chicken", "Sausage", "Pepperoni", "Spicy Beef"}, 15.0);  //Test
    Pizza samsTestPizza2 = new Pizza("Veggie Supreme", new String[]{"Spinach", "Sweetcorn", "Onion", "Milk"}, 7.0);		 //Test
    
    Burger samsTestBurger = new Burger("Big Mac", new String[]{"Big Mac Sauce"}, 10);
    Burger samsTestBurger1 = new Burger("Bacon Supreme", new String[]{"B a ycon"}, 10);
    Burger samsTestBurger11 = new Burger("Antoines Special", new String[]{"Finest French beef"}, 10);

    //create a new array from the pizza objects we have just created
    pizzasTest = new Pizza[]{samsTestPizza, samsTestPizza1, samsTestPizza2};
    foody = new Food[]{samsTestPizza, samsTestPizza1, samsTestPizza2, samsTestBurger, samsTestBurger1, samsTestBurger11};
    burgers = new Burger[]{samsTestBurger, samsTestBurger1, samsTestBurger11};

    Customer samsCustomer = new Customer("Sam Wilcock", "3 Cherry Tree Lane");
    Customer samsCustomer2 = new Customer("Jadine Courtney", "129 Avenue");
    Customer samsCustomer3 = new Customer("Paul Wilcock", "56 Redbrick Road");
    
    
    // Internet Customers
    
    InternetCustomer samsTest = new InternetCustomer("Sam Wilcock", "56 Grover Lane", "Sammywilco372@gmail.com");
    InternetCustomer samsTest2 = new InternetCustomer("Sam Billcock", "68 Rover Lane", "WammySilco372@gmail.com");
    InternetCustomer samsTest3 = new InternetCustomer("Test Wilcock", "56 test Lane", "Test@gmail.com");


  
    customersTest = new Customer[]{samsCustomer, samsCustomer2, samsCustomer3};

    //Create new array of internetCustomers
    
    internetCustomers = new InternetCustomer[]{samsTest, samsTest2, samsTest3};
    
    // create an empty array for orders - will populate later (is 20 enough?)
    orders = new Order[20];

    // orderNumber starts at 0;
    orderNumber = 0;
  }

  //add an order to the list of orders (n.b., will fail at 21 orders...)

  public void addOrderTest(Customer customersTest, Pizza[] pizzasTest)
  {
	  orders[orderNumber] = new Order(customersTest, pizzasTest);
	  orderNumber++;
  }
  
  public void addOrderTest(Customer customersTest, Burger[] burgersTest) 
  {
	  orders[orderNumber] = new Order(customersTest, burgersTest);
	  orderNumber++;  	
  }
  
  //get the database of customers
  
  public Customer[] getCustomersTest()
  {
	  return customersTest;
  }

  //get the database of pizzas
  
  public Pizza[] getPizzasTest()
  {
	  return pizzasTest;
  }
  
  //InternetCustomers
  
  public InternetCustomer[] getInternetCustomers()
  {
	  return internetCustomers;
  }
  
  //Burgers
  public Burger[] getBurgers()
  {
	  return burgers;
  }
  
  //Food
  
  public Food[] getFood()
  {
	  return foody;
  }
  
  public String toString()
  {
		String pizuh ="";
		  
		  for(int i = 0; i < orders.length; i++)
		  {
			  if (orders[i]!=null)
			  {
				  pizuh += orders[i];
			  }
		  }
		  
		  return pizuh;
  }

  
}