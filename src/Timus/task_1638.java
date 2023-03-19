package Timus;
import java.util.Scanner;
public class task_1638 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lotto = in.nextLine();
        String[] nums = lotto.split(" ");
        int[] a = new int[nums.length];
        for(int i = 0; i < a.length; i++)
        {
            a[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(Math.abs((a[3] - a[2] - 1) * a[0] + (a[3] - a[2]) * a[1] * 2));
    }
}
