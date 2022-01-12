package decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        double cost = beverage.cost();
        double condimentCost = 0.05;
        return getCondimentCost(cost, condimentCost, beverage.getSize());
    }
}
