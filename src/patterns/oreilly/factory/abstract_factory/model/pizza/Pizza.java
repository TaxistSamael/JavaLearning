package patterns.oreilly.factory.abstract_factory.model.pizza;

import patterns.oreilly.factory.abstract_factory.PizzaIngridientFactory;
import patterns.oreilly.factory.abstract_factory.model.ingridients.*;

public abstract class Pizza {
    public String name;
    public patterns.oreilly.factory.abstract_factory.model.ingridients.Sauce sauce;
    public Dough dough;
    public Veggie[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clam clam;

    public PizzaIngridientFactory ingridientFactory;

    public Pizza (PizzaIngridientFactory ingridientFactory) {
        this.ingridientFactory = ingridientFactory;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350 degree");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore boxes");
    }

    @Override
    public String toString() {
        return "Pizza description: ololo something went ok";
    }
}
