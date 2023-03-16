package com.ua.robot.homework15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int smallListSize = 10;
        int bigListSize = 2000000;

        List<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < smallListSize; i++) {
           smallList.add(random.nextInt(1, 10));
        }
        System.out.println(smallList);

        List<Integer> bigList = new LinkedList<>();
        for (int i = 0; i < bigListSize; i++) {
            bigList.add(random.nextInt(1, 1000));
        }
        //System.out.println(bigList);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("A", 'M', 20, "electonics", 3));
        studentList.add(new Student("M", 'F', 19, "electonics", 2));
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }
}
