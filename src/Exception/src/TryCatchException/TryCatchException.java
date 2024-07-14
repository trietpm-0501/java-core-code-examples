package TryCatchException;

public class TryCatchException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Lỗi chia cho 0 - chứa mã có thể gây ngoại lễ
        } catch (ArithmeticException e) {
            System.out.println("Không thể chia cho 0: " + e.getMessage()); // Được sử dụng để xử lý ngoại lệ. 
            // Trong ví dụ này, ArithmeticException được bắt và thông báo lỗi sẽ được in ra màn hình.
        }
    }
}

// lỗi của người dùng, vấn đề logic hoặc lỗi không mong muốn nhưng có thể khắc phục được 
// (như lỗi tệp không tìm thấy, chia cho 0).

// IOException, SQLException, NullPointerException