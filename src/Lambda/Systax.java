package Lambda;

//Định nghĩa một functional interface với một phương thức duy nhất
interface Calculator {
	int calculate(int x, int y);
}

public class Systax {
	public static void main(String[] args) {
		
		Calculator multiply = (x, y) -> x * y;

		// Sử dụng lambda expression để tính và in kết quả
		int result = multiply.calculate(5, 3);
		System.out.println("Multiplication result: " + result);

		Calculator add = (x, y) -> {
			int sum = x + y;
			return sum;
		};

		int result1 = add.calculate(5, 3);
		System.out.println("Sum: " + result1);

	}
}
