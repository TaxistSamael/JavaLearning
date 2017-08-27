package patterns.oreilly.strategy.game.model;

import patterns.oreilly.strategy.game.weapon.WeaponBehaviour;

public abstract class Character {

    public WeaponBehaviour weaponBehaviour;

    public abstract void fight();

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
