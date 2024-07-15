package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class JavaCollectionEx {
	 public static void main(String[] args) {
	        // Khởi tạo ArrayList với các phần tử số nguyên
	        ArrayList<Integer> list = new ArrayList<>();
	        Collections.addAll(list, 9, 77, 3, 2, 56, 8, 53);

	        // Sắp xếp danh sách
	        Collections.sort(list);
	        System.out.println("Sorted List: " + list);

	        // Thực hiện tìm kiếm nhị phân cho phần tử 56
	        int index = Collections.binarySearch(list, 56);
	        if (index >= 0) {
	            System.out.println("Số 56 nằm ở vị trí: " + index);
	        } else {
	            System.out.println("Không tìm thấy số 56.");
	        }

	        // Đảo ngược danh sách
	        Collections.reverse(list);
	        System.out.println("Reversed List: " + list);
	    }
}