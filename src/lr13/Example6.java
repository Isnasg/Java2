package lr13;

import java.time.LocalTime;
import java.util.Random;

public class Example6 {
    private static int sum1 = 0;
    private static int sum2 = 0;
    private static int sum3 = 0;
    private static int sum4 = 0;
    private static int sum5 = 0;
    private static int sum6 = 0;
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int arr[][] = new int[6][10];
        System.out.println("Исходный массив ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = random.nextInt(2);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }           System.out.println(" ");
        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                sum1 += arr[0][j];
            }
            System.out.println("Сумма первого потока " + sum1);
        });
        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                sum2 += arr[1][j];
            }
            System.out.println("Сумма второго потока " + sum2);
        });
        Thread t3 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                sum3 += arr[2][j];
            }
            System.out.println("Сумма третьего потока " + sum3);
        });
        Thread t4 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                sum4 += arr[3][j];
            }
            System.out.println("Сумма четвертого потока " + sum4);
        });
        Thread t5 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                sum5 += arr[4][j];
            }
            System.out.println("Сумма пятого потока " + sum5);
        });
        Thread t6 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                sum6 += arr[5][j];
            }
            System.out.println("Сумма шестого потока " + sum6);
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
        int sum = sum1 + sum2 + sum3 + sum4 + sum5 + sum6;
        System.out.println("\n" + "Сумма всех потоков " + sum);
    }
}
