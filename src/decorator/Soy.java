package decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double cost = beverage.cost();
        double condimentCost = 0.05;
        return getCondimentCost(cost, condimentCost, beverage.getSize());
    }
}
