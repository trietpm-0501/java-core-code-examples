package Generic;

// Định nghĩa một lớp Calculator sử dụng generics
public class GenericEx<T extends Number> {
    private T num1;
    private T num2;

    public GenericEx(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Phương thức tính tổng
    public double sum() {
        return num1.doubleValue() + num2.doubleValue();
    }

    // Phương thức tính hiệu
    public double difference() {
        return num1.doubleValue() - num2.doubleValue();
    }

    // Phương thức tính tích
    public double product() {
        return num1.doubleValue() * num2.doubleValue();
    }

    // Phương thức tính thương
    public double quotient() {
        if (num2.doubleValue() != 0) {
            return num1.doubleValue() / num2.doubleValue();
        } else {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        // Sử dụng lớp Calculator với kiểu Integer
        GenericEx<Integer> intCalculator = new GenericEx<>(10, 5);
        System.out.println("Tổng : " + intCalculator.sum());
        System.out.println("Hiệu : " + intCalculator.difference());
        System.out.println("Nhân : " + intCalculator.product());
        System.out.println("Chia: " + intCalculator.quotient());

        System.out.println("---------------------------------------------------");
        // Sử dụng lớp Calculator với kiểu Double
        GenericEx<Double> doubleCalculator = new GenericEx<>(15.5, 2.5);
        System.out.println("Tổng : " + doubleCalculator.sum());
        System.out.println("Hiệu : " + doubleCalculator.difference());
        System.out.println("Nhân : " + doubleCalculator.product());
        System.out.println("Chia: " + doubleCalculator.quotient());
    }
}
