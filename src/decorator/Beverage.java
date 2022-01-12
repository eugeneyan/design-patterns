package decorator;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI}

    Size size = Size.TALL;
    String description = "Uninitialized beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public void getReceipt() {
        System.out.println("Beverage: " + this.getDescription() + " (" + this.getSize() + "), Cost: $" + Utils.round(this.cost(), 2));
    }
}
