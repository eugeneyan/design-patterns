package decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        double cost = beverage.cost();
        double condimentCost = 0.10;
        return getCondimentCost(cost, condimentCost, beverage.getSize());
    }
}
