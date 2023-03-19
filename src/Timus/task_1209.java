package Timus;
import java.util.Scanner;
import java.util.StringJoiner;
public class task_1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        StringJoiner result = new StringJoiner(" ");
        while (num > 0) {
            long x = in.nextLong();
            double s = Math.sqrt(8*x-7);
            if (s % 1 == 0)
                result.add("1");
            else
                result.add("0");
            num--;
        }
        in.close();
        System.out.println(result);
    }
}
