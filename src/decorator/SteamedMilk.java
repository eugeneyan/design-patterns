package decorator;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        double cost = beverage.cost();
        double condimentCost = 0.05;
        return getCondimentCost(cost, condimentCost, beverage.getSize());
    }
}
