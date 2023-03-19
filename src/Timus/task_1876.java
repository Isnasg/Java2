package Timus;
import java.util.Scanner;
public class task_1876 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=b*2+40;
        int d=39*2 + 40 + (a-40)*2 + 1;
        int max=Math.max(c, d);
        System.out.println(max);
    }
}
