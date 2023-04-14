package lr12;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает3 на вход список " +
                "строк и возвращает2 новый список, содержаший только те строки, " +
                "которые1 содержат только буквы(без цифр и символов).";
        List<String> strings = List.of(string.split(" "));
        Scanner in = new Scanner(System.in);
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        List<String> stringsAfter = filterCapitalizedStrings(strings);
        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }
    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream().filter(str -> str.chars().allMatch(Character::isLetter)).collect(Collectors.toList());
    }
}

