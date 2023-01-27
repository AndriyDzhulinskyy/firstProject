package com.ua.robot.homework6;

public class Main {
    public static void main(String[] args) {

        // числа від 1 до 10
        int limitInt = 10;
        for (int i = 1; i <= limitInt; i++){
            System.out.print(i + " ");
        }
        System.out.println("");

        // парні числа
        int i = 1;
        int limitEven = 100;
        while (i <= limitEven){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("");

        // факторіал
        int limitFact = 7;
        long fact = 1;
        for (int j = 1; j <= limitFact; j++){
            fact = fact * j;
        }
        System.out.println(limitFact + "! = " + fact);

        // фібоначчі
        int limitFibonazzi = 100;
        int f1 = 0;
        int f2 = 1;
        int sum = f1 + f2;
        do {
            System.out.print(sum + " ");
            f1 = f2;
            f2 = sum;
            sum = f1 + f2;
        } while (sum < limitFibonazzi);
    }
}
