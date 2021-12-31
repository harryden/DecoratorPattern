package PizzaDecorator;

public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding PizzaDecorator.Mozzarella");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", PizzaDecorator.Mozzarella";
    }

    public double getCost() {
        return tempPizza.getCost() + 0.79;
    }
}

