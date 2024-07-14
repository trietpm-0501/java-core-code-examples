package Interface;

public class Duck implements Animul, Bird, Fish {
    @Override
    public void eat() {
        System.out.println("Interface.Duck is eating");
    }

    @Override
    public void fly() {
        System.out.println("Interface.Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Interface.Duck is swimming");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.eat();
        duck.fly();
        duck.swim();
    }
}
