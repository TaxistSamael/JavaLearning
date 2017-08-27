package patterns.oreilly.factory.factory_method;

import patterns.oreilly.factory.factory_method.model.chicago.ChicagoCheesePizza;
import patterns.oreilly.factory.factory_method.model.chicago.ChicagoPepperoniPizza;
import patterns.oreilly.factory.factory_method.model.chicago.ChicagoVeggiePizza;
import patterns.oreilly.factory.simple_factory.model.*;

public class ChicagoPizzaStore extends AbstractPizzaStore {

    @Override
    Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case CHEESE:
                pizza = new ChicagoCheesePizza();
                break;
            case PEPPERONI:
                pizza = new ChicagoPepperoniPizza();
                break;
            case VEGGIE:
                pizza = new ChicagoVeggiePizza();
                break;
        }

        return pizza;
    }
}
