package com.ua.robot.homework19;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Melnyk");
        list.add("Kravchenko");
        list.add("Boyko");
        list.add("Shvets");
        list.add("Shevchenko");
        list.add("Boyko");
        list.add("Savchuk");
        list.add("Tkach");
        list.add("Melnyk");
        list.add("Boyko");
        list.add("Goncharuk");
        list.add("Kravchenko");
        list.add("Melnyk");
        list.add("Tkach");
        list.add("Voloshyn");
        list.add("Shvets");
        list.add("Melnyk");
        list.add("Voloshyn");
        list.add("Bodnar");
        list.add("Shvets");

        System.out.println(list);

        Map<String, Long> listToMap = list.stream()
                .collect(Collectors.groupingBy(it -> it, Collectors.counting()));

        System.out.println("\n" + listToMap);

        List<Integer> randomList = new Random().ints(20, 0, 10).boxed().collect(Collectors.toList());
        System.out.println("\n" + randomList);

        int sum = randomList.stream().mapToInt(it -> it).sum();
        System.out.println("\n" + sum);
    }
}
