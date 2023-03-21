package com.ua.robot.homework16;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int numberOfCycles = 1000;

        int lowBound = 1;
        int highBound = 50;

        Set<Integer> hs = new HashSet<>();
        Set<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> ts = new TreeSet<>();

        for (int i = 0; i < numberOfCycles; i++) {
            hs.add(random.nextInt(lowBound, highBound));
            lhs.add(random.nextInt(lowBound, highBound));
            ts.add(random.nextInt(lowBound, highBound));
        }
        System.out.println("\nHashSet : " + hs + "\n\nLinkedHashSet : " + lhs + "\n\nTreeSet : " + ts);
    }
}
