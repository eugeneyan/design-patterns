package decorator;


public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.size;
    }

    public double getCondimentCost(double cost, double condimentCost, Size size) {
        if (size == Size.TALL) {
            cost += condimentCost * 2;
        } else if (size == Size.GRANDE) {
            cost += condimentCost * 3;
        } else if (size == Size.VENTI) {
            cost += condimentCost * 4;
        }
        return cost;
    }
}
