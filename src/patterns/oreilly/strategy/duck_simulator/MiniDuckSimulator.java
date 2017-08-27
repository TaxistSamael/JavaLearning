package patterns.oreilly.strategy.duck_simulator;

import patterns.oreilly.strategy.duck_simulator.fly.FlyRockerPowered;
import patterns.oreilly.strategy.duck_simulator.models.Duck;
import patterns.oreilly.strategy.duck_simulator.models.MallardDuck;
import patterns.oreilly.strategy.duck_simulator.models.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        final Duck duck = new MallardDuck();
        //происходит делегация вызова интерфейсам FlyBehaviour and QuackBehavior
        duck.performFly();
        duck.performQuack();

        final Duck model = new ModelDuck();
        model.performFly();
        //динамическое изменение поведения объекта при помощи set метода
        model.setFlyBehaviour(new FlyRockerPowered());
        model.performFly();
    }
}
