package lr12;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список " +
                "строк и возвращает новый список, содержаший только те строки, " +
                "которые содержат заданную подстроку.";
        List<String> strings = List.of(string.split(" "));
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        String key = in.nextLine();
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        List<String> stringsAfter = filterCapitalizedStrings(strings, key);
        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }
    public static List<String> filterCapitalizedStrings(List<String> list, String key) {
        return list.stream().filter(s -> s.contains(key)).collect(Collectors.toList());
    }
}