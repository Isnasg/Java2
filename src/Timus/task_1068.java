package Timus;
import java.util.Scanner;
public class task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum;
        if (n > 0)
            sum = n*(n+1)/2;
        else
            sum = n*(-n+1)/2+1;
        System.out.println(sum);
    }
}
