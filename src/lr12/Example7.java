package lr12;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список " +
                "строк и возвращает новый список, содержаший только те строки, " +
                "которые имеют длину больше заданного значения.";
        System.out.println("\n" + "Введите минимальную длину слова");
        Scanner in = new Scanner(System.in);
        int delitel = in.nextInt();
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        List<String> stringsAfter = filterCapitalizedStrings(strings, delitel);
        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }
    public static List<String> filterCapitalizedStrings(List<String> list, int delitel) {
        return list.stream().filter(s -> s.length() > delitel).collect(Collectors.toList());
    }
}
