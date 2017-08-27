package patterns.oreilly.factory.simple_factory;

import patterns.oreilly.factory.simple_factory.model.Pizza;
import patterns.oreilly.factory.simple_factory.model.PizzaType;

public class PizzaStore {

    private final SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

    public Pizza orderPizza(PizzaType type) {
        final Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }
}
