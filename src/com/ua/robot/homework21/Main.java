package com.ua.robot.homework21;

public class Main {

    public static void main(String[] args) {

        int numberToCheck = 10;

        try {
            System.out.println(numberToCheck + " ^ 2 = " + squared(numberToCheck));
        } catch (CheckNegativeException e) {
            e.printStackTrace();
        }

    }
    public static int squared(int i) throws CheckNegativeException {
        if (i < 0) {
            throw new CheckNegativeException();
        }
        return i * i;
    }
}