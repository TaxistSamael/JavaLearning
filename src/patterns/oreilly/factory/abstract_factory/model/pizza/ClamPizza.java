package patterns.oreilly.factory.abstract_factory.model.pizza;

import patterns.oreilly.factory.abstract_factory.PizzaIngridientFactory;
import patterns.oreilly.factory.abstract_factory.model.pizza.Pizza;

public class ClamPizza extends Pizza {

    public ClamPizza(PizzaIngridientFactory ingridientFactory) {
        super(ingridientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();
        clam = ingridientFactory.createClam();
    }
}
