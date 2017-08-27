package patterns.oreilly.strategy.duck_simulator.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
