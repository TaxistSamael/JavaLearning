package patterns.oreilly.factory.factory_method.model.chicago;


import patterns.oreilly.factory.simple_factory.model.Pizza;

public class ChicagoCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Chicago cheese");
    }

    @Override
    public void bake() {
        System.out.println("bake Chicago cheese");
    }

    @Override
    public void box() {
        System.out.println("box Chicago cheese");
    }

    @Override
    public void cut() {
        System.out.println("cut Chicago cheese");
    }
}
