package patterns.oreilly.factory.simple_factory.model;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare cheese");
    }

    @Override
    public void bake() {
        System.out.println("bake cheese");
    }

    @Override
    public void box() {
        System.out.println("box cheese");
    }

    @Override
    public void cut() {
        System.out.println("cut cheese");
    }
}
