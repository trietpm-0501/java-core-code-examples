package Inherit;

public class Meow extends Pet {
    public void speak() {
        System.out.println("Gâuu");
    }
    public static void main(String[] args) {
        Meow d = new Meow();
        d.food();
        d.speak();
    }
}





