package Error;

public class Error {
    public static void main(String[] args) {
        try {
            recursiveMethod(); // Gọi phương thức đệ quy không dừng, gây ra StackOverflowError
        } catch (StackOverflowError e) {
            System.out.println("Lỗi tràn ngăn xếp: " + e.getMessage());
        }
    }

    public static void recursiveMethod() {
        recursiveMethod(); // Gọi đệ quy vô hạn
    }

}

// error thuộc loại unchecked error 
// Mục đích: Đại diện cho các lỗi hệ thống hoặc tài nguyên (như hết bộ nhớ, lỗi hệ thống
// ví dụ: OutOfMemoryError, StackOverflowError
