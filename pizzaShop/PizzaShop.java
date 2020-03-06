package pizzaShop;

/*
 * A class to model a pizza shop - has a database of pizzas, customers and 
 * can recieve orders
 */

public class PizzaShop
{
  //the pizza database - all pizzas that can be ordered
  private Pizza[]    pizzas;
  
  private Pizza[]    pizzasTest; //Test

  
  //the customer database - all customers that are known to the system
  private Customer[] customers;
  private Customer[] customersTest;//Test
  
  private InternetCustomer[] internetCustomers;

  
  //the orders that have been placed so far
  private Order[]    orders;

  //a variable to track what the next order number will be
  private int        orderNumber;

  public PizzaShop()
  {
    // load Pizzas (we could load these from a database using file io)
    Pizza pizza1 =
        new Pizza("margherita", new String[] { "cheese", "tomato" }, 5.00);
    Pizza pizza2 = new Pizza("hawain",
        new String[] { "cheese", "tomato", "ham", "pineapple" }, 6.50);
    Pizza pizza3 = new Pizza("funghi",
        new String[] { "cheese", "tomato", "mushroom" }, 6.00);
    
    Pizza samsTestPizza = new Pizza("Chicken Supreme", new String[]{"Chicken", "Chorizo", "Cheddar", "Peppers"}, 10.50);     //Test
    Pizza samsTestPizza1 = new Pizza("Meat Supreme", new String[]{"Chicken", "Sausage", "Pepperoni", "Spicy Beef"}, 15.0);  //Test
    Pizza samsTestPizza2 = new Pizza("Veggie Supreme", new String[]{"Spinach", "Sweetcorn", "Onion", "Milk"}, 7.0);		 //Test
    

    //create a new array from the pizza objects we have just created
    pizzas = new Pizza[] { pizza1, pizza2, pizza3 };
    pizzasTest = new Pizza[]{samsTestPizza, samsTestPizza1, samsTestPizza2};


    // load Customers (we could load these from a database using file io)
    Customer customer1 = new Customer("Joe Bloggs", "12 Mayfair");
    Customer customer2 = new Customer("Fred Smith", "34 Oxford Road");
    Customer customer3 = new Customer("John Doe", "1 Bond Street");
    
    Customer samsCustomer = new Customer("Sam Wilcock", "3 Cherry Tree Lane");
    Customer samsCustomer2 = new Customer("Jadine Courtney", "129 Avenue");
    Customer samsCustomer3 = new Customer("Paul Wilcock", "56 Redbrick Road");
    
    
    // Internet Customers
    
    InternetCustomer samsTest = new InternetCustomer("Sam Wilcock", "56 Grover Lane", "Sammywilco372@gmail.com");
    InternetCustomer samsTest2 = new InternetCustomer("Sam Billcock", "68 Rover Lane", "WammySilco372@gmail.com");
    InternetCustomer samsTest3 = new InternetCustomer("Test Wilcock", "56 test Lane", "Test@gmail.com");


    //create a new array from the customers we have just created
    customers = new Customer[] { customer1, customer2, customer3 };
    customersTest = new Customer[]{samsCustomer, samsCustomer2, samsCustomer3};

    //Create new array of internetCustomers
    
    internetCustomers = new InternetCustomer[]{samsTest, samsTest2, samsTest3};
    
    // create an empty array for orders - will populate later (is 20 enough?)
    orders = new Order[20];

    // orderNumber starts at 0;
    orderNumber = 0;
  }

  //add an order to the list of orders (n.b., will fail at 21 orders...)
  public void addOrder(Customer customer, Pizza[] pizzas)
  {    
    orders[orderNumber] = new Order(customer, pizzas);
    orderNumber++;
  }
  
  public void addOrderTest(Customer customersTest, Pizza[] pizzasTest)
  {
	  orders[orderNumber] = new Order(customersTest, pizzasTest);
	  orderNumber++;
  }

  
  public void addInternetOrder(InternetCustomer internetCustomerTest, Pizza[] internetPizza)
  {
	  orders[orderNumber] = new Order(internetCustomerTest, internetPizza);
	  orderNumber++;
  }
  //get the database of customers
  public Customer[] getCustomers()
  {
    return customers;
  }
  
  public Customer[] getCustomersTest()
  {
	  return customersTest;
  }

  //get the database of pizzas
  public Pizza[] getPizzas()
  {
    return pizzas;
  }
  
  public Pizza[] getPizzasTest()
  {
	  return pizzasTest;
  }
  
  //InternetCustomers
  
  public InternetCustomer[] getInternetCustomers()
  {
	  return internetCustomers;
  }
  
  //To Strin Method
  public String toString()
  {
	String pizuh ="";
	  
	  for(int i = 0; i < orders.length; i++)
	  {
		  pizuh += orders[i];
	  }
	  
	  return pizuh;
  }
  
  public String toStringTest()
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