package com.ua.robot.homework18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students("Yurchenko", 19));
        list.add(new Students("Melnyk", 22));
        list.add(new Students("Lutsenko", 40));
        list.add(new Students("Kurko",33));
        list.add(new Students("Avramenko", 25));

        System.out.println("\nOriginal : " + list);
        Collections.sort(list, Comparator.comparing(Students::getSurname));
        System.out.println("\nSorted by surname : " + list);
        Collections.sort(list, Comparator.comparing(Students::getAge));
        System.out.println("\nSorted by age : " + list);
    }
}
