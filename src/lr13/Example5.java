package lr13;

import java.time.LocalTime;
import java.util.Random;

public class Example5 {
    private static int max1 = 0;
    private static int max2 = 0;
    private static int max3 = 0;
    private static int max4 = 0;
    private static int max5 = 0;
    private static int max6 = 0;
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int arr[][] = new int[6][10];
        System.out.println("Исходный массив ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }           System.out.println(" ");
        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                if (max1 < arr[0][j]) {
                    max1 = arr[0][j];
                }
            }
            System.out.println("Максимальное число первого потока " + max1);
        });
        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                if (max2 < arr[1][j]) {
                    max2 = arr[1][j];
                }
            }
            System.out.println("Максимальное число второго потока " + max2);
        });
        Thread t3 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                if (max3 < arr[2][j]) {
                    max3 = arr[2][j];
                }
            }
            System.out.println("Максимальное число третьего потока " + max3);
        });
        Thread t4 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                if (max4 < arr[3][j]) {
                    max4 = arr[3][j];
                }
            }
            System.out.println("Максимальное число четвертого потока " + max4);
        });
        Thread t5 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                if (max5 < arr[4][j]) {
                    max5 = arr[4][j];
                }
            }
            System.out.println("Максимальное число пятого потока " + max5);
        });
        Thread t6 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                if (max6 < arr[5][j]) {
                    max6 = arr[5][j];
                }
            }
            System.out.println("Максимальное число шестого потока " + max6);
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        int max = 0;
        if (max < max1) {max = max1;}
        if (max < max2) {max = max2;}
        if (max < max3) {max = max3;}
        if (max < max4) {max = max4;}
        if (max < max5) {max = max5;}
        if (max < max6) {max = max6;}
        System.out.println("\n" + "Максимальное число всех потоков " + max);
    }
}
