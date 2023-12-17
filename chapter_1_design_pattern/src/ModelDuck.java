public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay(); // ModelDuck inherits flyBehavior from Duck
        quackBehavior = new Quack(); // ModelDuck inherits quackBehavior from Duck
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
