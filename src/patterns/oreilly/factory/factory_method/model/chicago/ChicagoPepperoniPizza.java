package patterns.oreilly.factory.factory_method.model.chicago;

import patterns.oreilly.factory.simple_factory.model.Pizza;

public class ChicagoPepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Chicago Pepperoni");
    }

    @Override
    public void bake() {
        System.out.println("bake Chicago Pepperoni");
    }

    @Override
    public void box() {
        System.out.println("box Chicago Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("cut Chicago Pepperoni");
    }
}

