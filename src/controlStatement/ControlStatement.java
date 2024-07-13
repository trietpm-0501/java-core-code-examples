package controlStatement;

// import java.util.Random;

public class ControlStatement {

    public boolean test(int i) {
        int[] num = { 1, 2, 3, 4 };
        for (int j : num) {
            if (i == j)
                return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        // Random rand = new Random();
        // int test = rand.nextInt(3);

        // if (test > 9)
        // System.out.println("I hate programming");
        // else if (test > 5)
        // System.out.println("Still hate programming");
        // else
        // System.out.println("Why am i programming?");
        // -------------------------------------------------------------
        // switch (test) {
        // case 0:
        // System.out.println("0");
        // break;

        // case 1:
        // System.out.println("1");
        // break;
        // default:
        // System.out.println("2");
        // }
        // -------------------------------------------------------------
        // for (int i = 1; i < 6; ++i) {
        // System.out.println(i);
        // }

        // int[] numb = { 1, 2, 3, 4, 5 };
        // for (int i : numb) {
        // System.out.println(i);
        // }
        // -------------------------------------------------------------
        // This will print "Mama Mia" forever
        // while (true) {
        // System.out.println("Mama Mia");
        // }
        // -------------------------------------------------------------
        // do {
        // System.out.println("Help! I can't escape this freaking loop!!!");
        // } while (true);
        // -------------------------------------------------------------
        // test: for (int i = 0; i < 1000; ++i) {
        // test2: for (int j = 0; j < 1000; ++j) {
        // if (j == 500) {
        // continue;// skip and assign j = 501
        // } else if (j == 510)
        // break test; //this will end the test loop
        // //break; <- this will end the loop it is in,
        // // which is the test2
        // }
        // break; //this will end the test loop
        // }
    }
}
