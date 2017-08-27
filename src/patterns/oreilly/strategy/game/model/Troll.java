package patterns.oreilly.strategy.game.model;

import patterns.oreilly.strategy.game.weapon.AxeBehaviour;

public class Troll extends Character {

    public Troll () {
        setWeaponBehaviour(new AxeBehaviour());
    }

    @Override
    public void fight() {
        weaponBehaviour.useWeapon();
    }
}
