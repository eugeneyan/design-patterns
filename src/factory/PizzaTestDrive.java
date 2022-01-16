package factory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Pizza ordered: " + pizza.getName());
        System.out.println(pizza);
        System.out.println("========================================================");

        pizza = chicagoStore.orderPizza("everything");
        System.out.println("Pizza ordered: " + pizza.getName());
        System.out.println(pizza);
        System.out.println("========================================================");
    }
}
