package Timus;
import java.util.Scanner;
public class task_1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result;
        int n = in.nextInt();
        int a = in.nextInt();
        result = (n * (a + 1));
        System.out.println(result);
        in.close();
    }
}
