package patterns.oreilly.factory.factory_method.model.new_york;

import patterns.oreilly.factory.simple_factory.model.Pizza;

public class NYVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare NY Veggie");
    }

    @Override
    public void bake() {
        System.out.println("bake NY Veggie");
    }

    @Override
    public void box() {
        System.out.println("box NY Veggie");
    }

    @Override
    public void cut() {
        System.out.println("cut NY Veggie");
    }
}
