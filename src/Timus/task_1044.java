package Timus;
import java.util.Scanner;
public class task_1044 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt()/2;
        int[][] Array = new int [numbers + 1][numbers*9+1];
        for (int d = 0; d <= numbers; d++) {
            Array[d][0] = 1;
        }
        for (int j = 1; j <= numbers; j++) {
            for (int i = 1; i <= numbers*9; i++) {
                Array[j][i] = 0;
                for (int z = 0; (z <= 9) && ((i - z) >= 0); z++) {
                    Array[j][i] += Array[j - 1][i - z];
                }
            }
        }
        int x = 0;
        for (int y = 0; y <= numbers*9; y++) {
            x += Array[numbers][y]*Array[numbers][y];
        }
        System.out.println(x);

    }
}
