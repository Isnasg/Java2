package Timus;
import java.math.BigInteger;
import java.util.Scanner;
public class task_1243 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        BigInteger integer=new BigInteger(in.next());
        System.out.println(integer.remainder(new BigInteger(String.valueOf(7))));
    }
}
