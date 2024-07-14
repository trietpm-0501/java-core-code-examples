package TryCatchFinally;

import java.io.*;
import java.util.*;

public class exception1 {
    public static void main (String[] args) {
    	try {
    		int[] nums = {1,2,3};
    		System.out.println(nums[10]); // num[2]
    		
    	}catch(Exception e){
    		System.out.println(e.getLocalizedMessage());
    	}finally {
    		System.out.println("Try again");
    	}
    	
    }
}
// Dù có exception hay không thì finally block vẫn thực thi và hiện ra kết quả
// Mục đích sử dụng: hữu ích để dọn dẹp tài nguyên, như đóng file hoặc kết nối mạng.

	

