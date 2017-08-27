package patterns.oreilly.strategy.duck_simulator.fly;

public class FlyRockerPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm rocket-powered flyer");
    }
}
