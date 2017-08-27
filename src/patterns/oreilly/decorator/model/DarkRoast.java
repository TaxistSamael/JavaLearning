package patterns.oreilly.decorator.model;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        description = "Dark Roast Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        return .99;
    }
}
