package patterns.oreilly.decorator.model;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        description = "House Blend Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        return .89;
    }
}
