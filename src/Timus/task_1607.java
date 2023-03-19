package Timus;
import java.util.Scanner;
public class task_1607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lotto = in.nextLine();
        String[] nums = lotto.split(" ");
        int[] a = new int[nums.length];
        for(int i = 0; i < a.length; i++)
        {
            a[i] = Integer.parseInt(nums[i]);
        }
        while (a[0] < a[2]) {
            if (a[0] + a[1] >= a[2]) {
                a[0] = a [2];
                break;
            }
            a[0] += a[1];
            a[2] -= a[3];
        }
        System.out.println(a[0]);
    }
}
