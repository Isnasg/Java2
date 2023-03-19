package Timus;
import java.util.Scanner;
public class task_2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int exz = in.nextInt();
        float score = 0, five = 0;
        boolean three = false;
        if ( 1 <= exz && exz <= 10 ) {
            int[] array = new int [exz];
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
                if (array[i] <= 3) {
                    three = true;
                }
                if (array[i] == 5) {
                    five++;
                }
                score += array[i];
            }
            if (!three) {
                if (five == exz) {
                    System.out.println("Named");
                } else {
                    score = score / exz;
                    if (score >= 4.5) {
                        System.out.println("High");
                    } else if (score < 4.5) {
                        System.out.println("Common");
                    }
                }
            } else {
                System.out.println("None");
            }
        }
    }
}
