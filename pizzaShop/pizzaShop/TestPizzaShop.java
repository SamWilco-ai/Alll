package pizzaShop;

public class TestPizzaShop
{
  public static void main(String[] args)
  {
    PizzaShop pizzaShop = new PizzaShop();

    InternetCustomer[] internetTest = pizzaShop.getInternetCustomers();
    Customer[] customersTest = pizzaShop.getCustomersTest(); //gets customer name from array
    Pizza[] allPizzasTest = pizzaShop.getPizzasTest(); //gets pizza details from array
    
    
    //Orders
    
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
    Pizza[] internetPizzas = new Pizza[4]; //creates Pizza array of size 4

    internetPizzas[0] = allPizzasTest[0];
    internetPizzas[1] = allPizzasTest[1];
    internetPizzas[2] = allPizzasTest[2];
    internetPizzas[3] = allPizzasTest[1];
    
    pizzaShop.addOrderTest(internetCustomerTest, internetPizzas);
    
    
    internetCustomerTest = internetTest[0];
    internetPizzas = new Pizza[2];
    
    internetPizzas[0] = allPizzasTest[0];
    internetPizzas[1] = allPizzasTest[2];
    
    pizzaShop.addOrderTest(internetCustomerTest, internetPizzas);
    
    
    System.out.println(pizzaShop.toString());
    
    

    
    
    
    
  }

}
