package MultipleException;

public class MultipleException {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Ngoại lệ ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Chỉ mục ngoài phạm vi: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Không thể chia cho 0: " + e.getMessage());
        }
    }

}

// Cho phép xử lý các loại ngoại lệ khác nhau trong cùng một khối 'try'. 
// Mỗi loại ngoại lệ sẽ có một 'catch' block tương ứng.
