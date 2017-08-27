package patterns.oreilly.factory.abstract_factory;

import patterns.oreilly.factory.simple_factory.model.PizzaType;

/**
 * Concrete factory for pizza.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    patterns.oreilly.factory.abstract_factory.model.pizza.Pizza createPizza(PizzaType type) {
        patterns.oreilly.factory.abstract_factory.model.pizza.Pizza pizza = null;
        //ingridient factory for Chicago is not implemented. I'm lazy :)
        final PizzaIngridientFactory ingridientFactory = new NYPizzaIngridientFactory();

        switch (type) {
            case CHEESE: pizza = new patterns.oreilly.factory.abstract_factory.model.pizza.CheesePizza(ingridientFactory);
                pizza.name = "Chicago style cheese pizza";
                break;
            case VEGGIE: pizza = new patterns.oreilly.factory.abstract_factory.model.pizza.VeggiePizza(ingridientFactory);
                pizza.name = "Chicago style veggie pizza";
                break;
            case CLAM: pizza = new patterns.oreilly.factory.abstract_factory.model.pizza.ClamPizza(ingridientFactory);
                pizza.name = "Chicago style clam pizza";
                break;
        }

        return pizza;
    }
}
