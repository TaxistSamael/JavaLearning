package patterns.oreilly.strategy.game.model;

import patterns.oreilly.strategy.game.weapon.KnifeBehavior;

public class King extends Character {

    public King() {
        setWeaponBehaviour(new KnifeBehavior());
    }

    @Override
    public void fight() {
        weaponBehaviour.useWeapon();
    }
}
