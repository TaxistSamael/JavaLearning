package patterns.oreilly.factory.abstract_factory;

import patterns.oreilly.factory.abstract_factory.model.ingridients.*;

/**
 * This is abstract factory interface for pizza ingridients.
 */
public interface PizzaIngridientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie [] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
