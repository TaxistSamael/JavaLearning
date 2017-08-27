package patterns.oreilly.factory.simple_factory;

import patterns.oreilly.factory.simple_factory.model.*;

public class SimplePizzaFactory {

    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
        }

        return pizza;
    }


}
