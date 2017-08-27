package patterns.oreilly.strategy.duck_simulator.models;

import patterns.oreilly.strategy.duck_simulator.fly.FlyWithWings;
import patterns.oreilly.strategy.duck_simulator.quack.Quack;

public class MallardDuck extends Duck {

    /**
     * Хороший вариант, но он не позволяет динамически менять поведение созданного объекта.
     */
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
