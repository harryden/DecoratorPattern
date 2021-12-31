package CombatCartDecorator;

public class CombatCartRunner {

    public static void main(String[] args) {
        CombatCart basicCart = new BasicCart();
        basicCart.gas();
        basicCart.fire();
        CombatCart missileCart = new MissilePowerup(basicCart);
        missileCart.gas();
        missileCart.fire();
        CombatCart turboMissileCart = new TurboPowerup(missileCart);
        turboMissileCart.gas();
        turboMissileCart.fire();

    }
}
