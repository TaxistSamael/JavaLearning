package patterns.oreilly.strategy.game.weapon;

public class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Use bow and arrow");
    }
}
