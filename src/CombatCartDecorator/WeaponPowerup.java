package CombatCartDecorator;

public class WeaponPowerup extends PowerupDecorator {
    WeaponPowerup(CombatCart newCombatCart) {
        super(newCombatCart);

        System.out.println("Adding upgraded Weapon");
    }

    @Override
    public void fire() {
        System.out.println("Firing Upgraded Weapon");
    }
}
