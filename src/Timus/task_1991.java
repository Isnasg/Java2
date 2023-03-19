package Timus;

import java.util.Scanner;

public class task_1991 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int droid = 0, boom = 0;
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (k - array[i] >= 0) {
                droid += k - array[i];
            } else {
                boom += Math.abs(k - array[i]);
            }
        }
        System.out.println(boom + " " + droid);
    }
}
