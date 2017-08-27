package patterns.oreilly.decorator.decorators;

import patterns.oreilly.decorator.model.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
