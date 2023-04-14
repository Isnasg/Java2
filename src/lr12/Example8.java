package lr12;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int delitel = in.nextInt();
        int [] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));
        int[] arrResult = filterEvenNumbers(arr, delitel);
        System.out.println("Массив arrResult:");
        System.out.println(Arrays.toString(arrResult));
    }
    public static int[] filterEvenNumbers(int[] arr, int delitel) {
        return Arrays.stream(arr).filter(x -> x > delitel).toArray();
    }
}
