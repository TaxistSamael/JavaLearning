package patterns.oreilly.factory.factory_method;

import patterns.oreilly.factory.factory_method.model.new_york.NYCheesePizza;
import patterns.oreilly.factory.factory_method.model.new_york.NYPepperoniPizza;
import patterns.oreilly.factory.factory_method.model.new_york.NYVeggiePizza;
import patterns.oreilly.factory.simple_factory.model.*;

public class NYPizzaStore extends AbstractPizzaStore {

    @Override
    Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case CHEESE:
                pizza = new NYCheesePizza();
                break;
            case PEPPERONI:
                pizza = new NYPepperoniPizza();
                break;
            case VEGGIE:
                pizza = new NYVeggiePizza();
                break;
        }

        return pizza;
    }
}
