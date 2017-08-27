package patterns.oreilly.decorator.decorators;

import patterns.oreilly.decorator.model.Beverage;

import static patterns.oreilly.decorator.model.Size.MEDIUM;

public class Mocha extends CondimentDecorator {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = 0;
        switch (beverage.size) {
            case MEDIUM: cost = 0.2;
            case SMALL: cost = 0.15;
            case BIG: cost = 0.25;
        }

        return cost + beverage.cost();
    }
}
