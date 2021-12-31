package CombatCartDecorator;

public abstract class PowerupDecorator implements CombatCart {

    CombatCart tempCombatCart;
    PowerupDecorator(CombatCart newCombatCart) {
        tempCombatCart = newCombatCart;
    }

    @Override
    public void gas() {
        System.out.println("Gasing");
    }

    @Override
    public void brake() {
        System.out.println("Braking");
    }

    @Override
    public void fire() {
        System.out.println("Firing Basic Weapon");
    }
}
