package patterns.oreilly.decorator;

import patterns.oreilly.decorator.decorators.Mocha;
import patterns.oreilly.decorator.decorators.Whip;
import patterns.oreilly.decorator.model.Beverage;
import patterns.oreilly.decorator.model.DarkRoast;
import patterns.oreilly.decorator.model.Espresso;
import patterns.oreilly.decorator.model.Size;

import static patterns.oreilly.decorator.model.Size.*;

public class StarbazzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Mocha(new Espresso(SMALL));
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage darkRoast = new DarkRoast(BIG);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);

        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
    }
}
