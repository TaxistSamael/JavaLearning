package patterns.oreilly.strategy.game.weapon;

public class KnifeBehavior implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Use knife");
    }
}
