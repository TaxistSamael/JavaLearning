package patterns.oreilly.decorator.decorators;

import patterns.oreilly.decorator.model.Beverage;

public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = 0;
        switch (beverage.size) {
            case MEDIUM: cost = 0.21;
            case SMALL: cost = 0.15;
            case BIG: cost = 0.25;
        }

        return cost + beverage.cost();
    }
}