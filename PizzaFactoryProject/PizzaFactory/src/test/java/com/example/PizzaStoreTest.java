import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.example.CheesePizza;
import com.example.GlutenFreePizza;
import com.example.GreekPizza;
import com.example.PepperoniPizza;
import com.example.Pizza;
import com.example.PizzaFactory;
import com.example.PizzaStore;

public class PizzaStoreTest {

    // Test ordering a Cheese Pizza
    @Test
    public void testOrderCheesePizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza("cheese");
        assertNotNull(pizza);
        assertTrue(pizza instanceof CheesePizza);
    }

    // Test ordering a Greek Pizza
    @Test
    public void testOrderGreekPizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza("greek");
        assertNotNull(pizza);
        assertTrue(pizza instanceof GreekPizza);
    }

    // Test ordering a Pepperoni Pizza
    @Test
    public void testOrderPepperoniPizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza("pepperoni");
        assertNotNull(pizza);
        assertTrue(pizza instanceof PepperoniPizza);
    }

    // Test ordering a Gluten-Free Pizza
    @Test
    public void testOrderGlutenFreePizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza("glutenfree");
        assertNotNull(pizza);
        assertTrue(pizza instanceof GlutenFreePizza);
    }

    
    @Test(expected = IllegalArgumentException.class)
    public void testOrderUnknownPizzaType() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("unknown");  
    }

    
    @Test
    public void testPizzaPreparationProcess() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza("cheese");

        assertNotNull(pizza);
        assertTrue(pizza instanceof CheesePizza);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    
    }
}