package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performQuack();
        model.performFly();
    }
}
