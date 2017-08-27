package patterns.oreilly.strategy.duck_simulator.models;

import patterns.oreilly.strategy.duck_simulator.fly.FlyNoWay;
import patterns.oreilly.strategy.duck_simulator.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
