package PizzaDecorator;

public class Ham extends ToppingDecorator {

    public Ham(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding ham");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", PizzaDecorator.Ham";
    }

    public double getCost() {
        return tempPizza.getCost() + 1.49;
    }
}
