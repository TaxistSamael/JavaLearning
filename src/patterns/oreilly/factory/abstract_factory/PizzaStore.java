package patterns.oreilly.factory.abstract_factory;

import patterns.oreilly.factory.abstract_factory.model.pizza.Pizza;
import patterns.oreilly.factory.simple_factory.model.PizzaType;

/**
 * This is abstract factory for pizza stores
 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        final patterns.oreilly.factory.abstract_factory.model.pizza.Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }

    abstract patterns.oreilly.factory.abstract_factory.model.pizza.Pizza createPizza(PizzaType type); //THIS IS FACTORY METHOD
}

