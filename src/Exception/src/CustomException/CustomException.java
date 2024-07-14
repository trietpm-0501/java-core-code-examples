package CustomException;

//Định nghĩa lớp Custom Exception
class InvalidAgeException extends Exception {
	 public InvalidAgeException(String message) {
	     super(message);
	 }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            setAge(200); // Gọi phương thức với giá trị tuổi không hợp lệ
        } catch (InvalidAgeException e) {
            System.out.println("Đã xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    // Phương thức để đặt tuổi với kiểm tra và ném ngoại lệ nếu không hợp lệ
    public static void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Tuổi không hợp lệ: " + age);
        }
        System.out.println("Tuổi hợp lệ: " + age);
    }
}

// Các TH sử dụng Custom Exception
// 1. Khi bạn cần tạo một ngoại lệ đặc biệt cho ứng dụng của mình
// 2. Khi bạn muốn cung cấp thông tin chi tiết hơn về lỗi
// 3. Khi bạn muốn tách biệt các loại lỗi khác nhau trong ứng dụng của mình








