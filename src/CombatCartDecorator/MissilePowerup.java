package CombatCartDecorator;

public class MissilePowerup extends PowerupDecorator {

    MissilePowerup(CombatCart newCombatCart) {
        super(newCombatCart);

        System.out.println("Added Missiles");
    }

    @Override
    public void fire() {
        System.out.println("Firing Missiles");
    }
}
