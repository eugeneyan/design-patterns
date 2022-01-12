package decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new SteamedMilk(beverage);
        beverage.getReceipt();

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2.getReceipt();

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3.getReceipt();

        Beverage beverage4 = new HouseBlend();
        beverage4.setSize(Beverage.Size.GRANDE);
        beverage4 = new Soy(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4.getReceipt();

        Beverage beverage5 = new HouseBlend();
        beverage5.setSize(Beverage.Size.VENTI);
        beverage5 = new Soy(beverage5);
        beverage5 = new Mocha(beverage5);
        beverage5 = new Whip(beverage5);
        beverage5.getReceipt();
    }
}
