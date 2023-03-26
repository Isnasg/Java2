package lr11;

import java.util.Scanner;
public class Task1 {
    public static int m(int n){
        if (n==0) {return 0;}
        return (n%2+10*m(n/2));
    }
    public static void main(String[] args) {
        try {
            Scanner in=new Scanner(System.in);
            System.out.println("Введите число:");
            int n=in.nextInt();
            System.out.printf("Ответ "+n+"= "+m(n));
        }
        catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); }
    }
}
