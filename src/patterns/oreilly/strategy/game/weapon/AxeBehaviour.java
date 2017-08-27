package patterns.oreilly.strategy.game.weapon;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Use axe");
    }
}
