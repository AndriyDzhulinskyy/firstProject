package com.ua.robot.homework5;

public class Main1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 1000;
        byte greaterOrLess;

        System.out.println("a = " + a + "    b = " + b);

        if (a > b){
            greaterOrLess = 1;
        } else if (a < b) {
            greaterOrLess = 0;
        } else {
            greaterOrLess = -1;
        }

        switch (greaterOrLess){
            case 1:
                System.out.println("a > b");
                break;
            case 0:
                System.out.println("b > a");
                break;
            case -1:
                System.out.println("a equal b");
                break;
        }
    }
}

