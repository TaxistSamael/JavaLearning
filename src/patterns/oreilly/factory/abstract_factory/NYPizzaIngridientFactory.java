package patterns.oreilly.factory.abstract_factory;

import patterns.oreilly.factory.abstract_factory.PizzaIngridientFactory;
import patterns.oreilly.factory.abstract_factory.model.ingridients.*;
import patterns.oreilly.factory.abstract_factory.model.ingridients.new_york.FreshClam;
import patterns.oreilly.factory.abstract_factory.model.ingridients.new_york.MarinaraSauce;
import patterns.oreilly.factory.abstract_factory.model.ingridients.new_york.ReggianoCheese;
import patterns.oreilly.factory.abstract_factory.model.ingridients.new_york.SlisedPepperoni;
import patterns.oreilly.factory.abstract_factory.model.ingridients.veggies.Garlic;
import patterns.oreilly.factory.abstract_factory.model.ingridients.veggies.Mushroom;
import patterns.oreilly.factory.abstract_factory.model.ingridients.veggies.Onion;
import patterns.oreilly.factory.abstract_factory.model.ingridients.veggies.RedPepper;

/**
 * Concrete ingridient factory for NY.
 */
public class NYPizzaIngridientFactory implements PizzaIngridientFactory {
    @Override
    public Dough createDough() {
        return new patterns.oreilly.factory.abstract_factory.model.ingridients.new_york.ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlisedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
