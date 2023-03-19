package Timus;
import java.util.Scanner;

public class task_1327 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int score = 0;
        for (; a <= b; a++) {
            if (a % 2 == 1) {
                score++;
            }
        }
        System.out.println(score);
        in.close();
    }
}
//1327. Предохранители
//    Исходные данные
//    Первая строка содержит целое число A. Вторая строка содержит целое число B. 1 ≤ A ≤ B ≤ 10000.
//        Результат
//        Выведите единственное число – количество предохранителей, которые спалит Янус в интервал времени с A-го рабочего дня по B-й.
//        Примеры
//        исходные данные
//        1
//        5
//        результат
//        3
//        исходные данные
//        100
//        200
//        результат
//        50