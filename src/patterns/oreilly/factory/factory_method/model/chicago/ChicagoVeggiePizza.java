package patterns.oreilly.factory.factory_method.model.chicago;

import patterns.oreilly.factory.simple_factory.model.Pizza;

public class ChicagoVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Chicago Veggie");
    }

    @Override
    public void bake() {
        System.out.println("bake Chicago Veggie");
    }

    @Override
    public void box() {
        System.out.println("box Chicago Veggie");
    }

    @Override
    public void cut() {
        System.out.println("cut Chicago Veggie");
    }
}
