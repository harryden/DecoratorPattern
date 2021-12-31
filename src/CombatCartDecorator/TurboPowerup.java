package CombatCartDecorator;

public class TurboPowerup extends PowerupDecorator {

    TurboPowerup(CombatCart newCombatCart) {
        super(newCombatCart);

        System.out.println("Adding Turbo");
    }

    @Override
    public void brake() {
        System.out.println("Braking with turbo");
    }

    @Override
    public void gas() {
        System.out.println("Gasing with Turbo");
    }
}
