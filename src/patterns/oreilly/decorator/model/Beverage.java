package patterns.oreilly.decorator.model;

public abstract class Beverage {
    String description = "";
    public Size size = Size.MEDIUM;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
