package com.ua.robot.homework20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner toScan = new Scanner(System.in);
        boolean flag = true;
        int num = 0;

        while (flag) {
            System.out.print("Enter a number: ");
            String input = toScan.nextLine();

          try {
                num = Integer.parseInt(input);
                flag = false;
            } catch (NumberFormatException e) {
              System.out.println("Incorrect number.");
            }
        }
        toScan.close();
        System.out.println("Number " + num + " is OK.");
    }
}
