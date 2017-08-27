package patterns.oreilly.strategy.game.weapon;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Use sword");
    }
}
