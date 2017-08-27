package patterns.oreilly.decorator.decorators;

import patterns.oreilly.decorator.model.Beverage;

public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage) {
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
            case MEDIUM: cost = 0.1;
            case SMALL: cost = 0.12;
            case BIG: cost = 0.16;
        }

        return cost + beverage.cost();
    }
}
