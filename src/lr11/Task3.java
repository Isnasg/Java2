package lr11;
import java.util.Scanner;
public class Task3 {
        public static Scanner in=new Scanner(System.in);
        public static int [] EntArray(int i, int [] arr) {
            if (i<0) {return arr;}
            else {
                System.out.print("["+i+"]=");
                int n = in.nextInt();
                arr[i] = n;
                EntArray(i-1, arr); //рекурсия
            }
            return arr;
        }
        public static void PrintArray (int i, int [] arr)
        {
            if(i<0) return;
            else PrintArray(i-1, arr); //рекурсия
            System.out.print("[" + (i) + "]=" + arr[i]+" ");
        }

        public static void main(String[] args) {
            try {
                System.out.println("Длина массива:");
                int size = in.nextInt();
                int [] array = new int[size];
                System.out.println("Введите элементы массива методом рекурсии:");
                array = EntArray(size-1, array);
                System.out.println("-------------------------------------------------");
                System.out.println("вывод массива методом рекурсии");
                PrintArray(size-1, array);
            }
            catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); } //обработка исключения
        }
    }
