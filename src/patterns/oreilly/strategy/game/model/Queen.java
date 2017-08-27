package patterns.oreilly.strategy.game.model;

import patterns.oreilly.strategy.game.weapon.BowAndArrowBehaviour;

public class Queen extends Character {

    public Queen() {
        setWeaponBehaviour(new BowAndArrowBehaviour());
    }

    @Override
    public void fight() {
        weaponBehaviour.useWeapon();
    }
}
