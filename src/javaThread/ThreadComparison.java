public class ThreadComparison {

    public static void main(String[] args) {

        // Không sử dụng Thread
        long startTimeNoThread = System.currentTimeMillis();
        countNumbers(1, 5_000_000);
        countNumbers(5_000_001, 10_000_000);
        long endTimeNoThread = System.currentTimeMillis();
        System.out.println("Tổng thời gian thực hiện (không thread): " + (endTimeNoThread - startTimeNoThread) + "ms");

        // Sử dụng Thread
        long startTimeThread = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> countNumbers(1, 5_000_000));
        Thread thread2 = new Thread(() -> countNumbers(5_000_001, 10_000_000));
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTimeThread = System.currentTimeMillis();
        System.out.println("Tổng thời gian thực hiện (có thread): " + (endTimeThread - startTimeThread) + "ms");
    }

    private static void countNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            // Mô phỏng công việc tốn thời gian
        }
        System.out.println("Đã đếm xong từ " + start + " đến " + end);
    }
}
