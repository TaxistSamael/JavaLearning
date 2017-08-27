package patterns.oreilly.factory.factory_method;

import patterns.oreilly.factory.simple_factory.model.Pizza;
import patterns.oreilly.factory.simple_factory.model.PizzaType;

abstract class AbstractPizzaStore {

    public Pizza orderPizza(PizzaType type) {
        final Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }

    abstract Pizza createPizza(PizzaType type); //THIS IS FACTORY METHOD
}
