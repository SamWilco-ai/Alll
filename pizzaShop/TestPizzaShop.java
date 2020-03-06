package pizzaShop;

public class TestPizzaShop
{
  public static void main(String[] args)
  {
    //Part 3a
    PizzaShop pizzaShop = new PizzaShop();
    
    //Part 3b
//    Customer [] customers = pizzaShop.getCustomers();    
//    Pizza [] allPizzas = pizzaShop.getPizzas();
    
    	InternetCustomer[] internetTest = pizzaShop.getInternetCustomers();
      Customer[] customersTest = pizzaShop.getCustomersTest(); //gets customer name from array
      Pizza[] allPizzasTest = pizzaShop.getPizzasTest(); //gets pizza details from array
      
      
      
    //create a new order
//    Customer orderingCustomer = customers[1];
//    Pizza [] orderedPizzas = new Pizza [2];
//    orderedPizzas[0] = allPizzas[1];
//    orderedPizzas[1] = allPizzas[1];
////    pizzaShop.addOrder(orderingCustomer, orderedPizzas);
//    
////    System.out.println(pizzaShop.toString());
//        
    //create 2 more orders
    Customer orderingCustomerTest = customersTest[0]; // gets customer test array numero uno
    Pizza[] orderedPizzasTest = new Pizza[4]; //creates Pizza array of size 4

    orderedPizzasTest[0] = allPizzasTest[0];
    orderedPizzasTest[1] = allPizzasTest[1];
    orderedPizzasTest[2] = allPizzasTest[2];
    orderedPizzasTest[3] = allPizzasTest[1];
    
    pizzaShop.addOrderTest(orderingCustomerTest, orderedPizzasTest);
    
    
        
    
    Customer orderingCustomerTest1 = customersTest[1]; // gets customer test array numero uno
    Pizza[] orderedPizzasTest1 = new Pizza[4]; //creates Pizza array of size 4

    orderedPizzasTest1[0] = allPizzasTest[0];
    orderedPizzasTest1[1] = allPizzasTest[1];
    orderedPizzasTest1[2] = allPizzasTest[2];
    orderedPizzasTest1[3] = allPizzasTest[1];
    
    pizzaShop.addOrderTest(orderingCustomerTest1, orderedPizzasTest1);
    
    
    InternetCustomer internetCustomerTest = internetTest[1]; // gets customer test array numero uno
    Pizza[] InternetPizzas = new Pizza[4]; //creates Pizza array of size 4

    InternetPizzas[0] = allPizzasTest[0];
    InternetPizzas[1] = allPizzasTest[1];
    InternetPizzas[2] = allPizzasTest[2];
    InternetPizzas[3] = allPizzasTest[1];
    
    pizzaShop.addOrderTest(internetCustomerTest, InternetPizzas);
    
    System.out.println(pizzaShop.toStringTest());


    
    
    
    
  }

}
