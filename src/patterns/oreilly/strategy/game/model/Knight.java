package patterns.oreilly.strategy.game.model;

import patterns.oreilly.strategy.game.weapon.SwordBehaviour;

public class Knight extends Character {

    public Knight() {
        setWeaponBehaviour(new SwordBehaviour());
    }

    @Override
    public void fight() {
        weaponBehaviour.useWeapon();
    }
}
