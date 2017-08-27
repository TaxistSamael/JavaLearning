package patterns.oreilly.factory.simple_factory.model;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Veggie");
    }

    @Override
    public void bake() {
        System.out.println("bake Veggie");
    }

    @Override
    public void box() {
        System.out.println("box Veggie");
    }

    @Override
    public void cut() {
        System.out.println("cut Veggie");
    }
}

