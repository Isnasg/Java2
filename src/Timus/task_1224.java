package Timus;
import java.util.Scanner;
public class task_1224 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long n=in.nextInt();
        long m=in.nextInt();
        System.out.println(Math.min(n,m)*2 -  (n>m ? 1 :2));
    }
}
