package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    System.out.println("第1課題");
    List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    numberList.stream()
        .filter(number -> number < 8)
        .forEach(System.out::println);

    List<String> catNames = List.of("TAMA", "KINAKO", "AZUKI", "TAMA", "TORA");
    catNames.stream()
        .map(String::toLowerCase)
        .forEach(System.out::println);

    catNames.stream()
        .sorted()
        .distinct()
        .forEach(System.out::println);

    System.out.println(catNames.stream()
        .sorted()
        .distinct()
        .collect(Collectors.joining(",")));

    catNames.stream()
        .limit(2)
        .forEach(System.out::println);

    System.out.println(catNames.stream()
        .distinct()
        .count());

    System.out.println(catNames.stream()
        .distinct()
        .anyMatch(v -> v.contains("O")));

    System.out.println("第2課題");
    String[] characterNames = new String[]{"悟空", "ベジータ", "ピッコロ", "悟飯", "チチ", "ブルマ",
        "セル", "フリーザ", "17号", "ブウ", "蘭", "哀"};
    List<String> characterNamesList = Arrays.asList(characterNames);
    System.out.println(characterNamesList.stream()
        .filter(name -> name.length() >= 2)
        .collect(Collectors.joining(",")));

    System.out.println("第3課題");
    List<Integer> numberList2 = List.of(100, 50, 25, 125, 150, 175, 200, 75, 275, 250, 225, 300);
    OptionalDouble avg = numberList2.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(Integer::intValue)
        .average();

    System.out.println(avg.getAsDouble());
  }
}
