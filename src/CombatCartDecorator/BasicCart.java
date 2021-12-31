package CombatCartDecorator;

public class BasicCart implements CombatCart {

    @Override
    public void gas() {
        System.out.println("Driving Forward");
    }

    @Override
    public void brake() {
        System.out.println("Stopping");
    }

    @Override
    public void fire() {
        System.out.println("Basic weapon fired");
    }
}
