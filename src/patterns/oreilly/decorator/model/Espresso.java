package patterns.oreilly.decorator.model;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
