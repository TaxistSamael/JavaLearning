package patterns.oreilly.factory.abstract_factory;

import patterns.oreilly.factory.abstract_factory.model.pizza.Pizza;
import patterns.oreilly.factory.simple_factory.model.PizzaType;

/**
 * This is concrete factory for NY pizza.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    patterns.oreilly.factory.abstract_factory.model.pizza.Pizza createPizza(PizzaType type) {
        patterns.oreilly.factory.abstract_factory.model.pizza.Pizza pizza = null;
        final PizzaIngridientFactory ingridientFactory = new NYPizzaIngridientFactory();

        switch (type) {
            case CHEESE: pizza = new patterns.oreilly.factory.abstract_factory.model.pizza.CheesePizza(ingridientFactory);
                pizza.name = "New York style cheese pizza";
                break;
            case VEGGIE: pizza = new patterns.oreilly.factory.abstract_factory.model.pizza.VeggiePizza(ingridientFactory);
                pizza.name = "New York style veggie pizza";
                break;
            case CLAM: pizza = new patterns.oreilly.factory.abstract_factory.model.pizza.ClamPizza(ingridientFactory);
                pizza.name = "New Your style clam pizza";
                break;
        }

        return pizza;
    }
}
