package patterns.oreilly.strategy.duck_simulator.quack;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
