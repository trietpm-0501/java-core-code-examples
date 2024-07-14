package Abstract;

public class Car extends Vehicle {
    public Car(String brand, int year) {
        super(brand, year);
    }
    @Override
    public void license() {
        System.out.println("License: B2");
    }

    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2021);
        car.displayInfo();
        car.license();
    }
}
