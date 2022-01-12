package decorator;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaffeinated coffee";
    }

    public double cost() {
        return 1.05;
    }
}
