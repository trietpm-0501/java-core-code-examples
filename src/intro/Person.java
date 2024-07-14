package intro;

public class Person {

    private String name;
    private int age;
    private String address;

    public Person() {
        this.name = "S";
        this.age = 20;
        this.address = "HCM";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayInfo();
        Person person2 = new Person("John Doe", 30, "123 Main St");
        person2.displayInfo();
    }
}