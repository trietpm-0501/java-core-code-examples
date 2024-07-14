package Throw;

public class Throw {
    public static void main(String[] args) {
        try {
            validateNumber(5); // Giá trị hợp lệ
            validateNumber(-1); // Giá trị không hợp lệ, sẽ ném ngoại lệ
        } catch (IllegalArgumentException e) {
            System.out.println("Đã bắt ngoại lệ: " + e.getMessage());
        }
    }

    // Phương thức kiểm tra số và ném ngoại lệ nếu không hợp lệ
    public static void validateNumber(int number) throws IllegalArgumentException{
        if (number < 0) {
            throw new IllegalArgumentException("Số phải lớn hơn hoặc bằng 0: " + number);
        }
        System.out.println("Số hợp lệ: " + number);
    }

}
// throw: 
// throws:được sử dụng trong khai báo phương thức để chỉ ra rằng phương thức đó có thể ném một 
// hoặc nhiều ngoại lệ
// Sử dụng throw khi: 
//1. Khi bạn gặp tình huống lỗi cần được xử lý ngay lập tức: vd: ktra thông số đầu vào
//2. Khi bạn muốn ném ngoại lệ từ một phương thức để thông báo về một lỗi xảy ra: vd: kết nối csdl thất bại
// bạn muốn thông báo lỗi này
