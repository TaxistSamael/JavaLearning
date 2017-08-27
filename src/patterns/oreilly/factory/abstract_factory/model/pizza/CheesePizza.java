package patterns.oreilly.factory.abstract_factory.model.pizza;

import patterns.oreilly.factory.abstract_factory.PizzaIngridientFactory;

/**
 * Cause we have abstract ingridient factory, no need to create 2 separate classes for Cheese Pizza.
 */
public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngridientFactory ingridientFactory) {
        super(ingridientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Prepare " + name);
        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();
    }
}
