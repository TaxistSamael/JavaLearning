package patterns.oreilly.factory.abstract_factory.model.pizza;

import patterns.oreilly.factory.abstract_factory.PizzaIngridientFactory;

public class VeggiePizza extends Pizza {

    public VeggiePizza(PizzaIngridientFactory ingridientFactory) {
        super(ingridientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing veggie pizza");
        sauce = ingridientFactory.createSauce();
        dough = ingridientFactory.createDough();
        veggies = ingridientFactory.createVeggies();
    }
}
