package com.ua.robot.homework7;

public class Main {
    public static void main(String[] args) {
        // оголошення параметрів для методів
        int number = 11;
        int starsQuantity = 35;
        int charsQuantity = 117;
        char symbol = 'T';

        // виклик методів
        System.out.println(number + " ^ 3 = " + cubedNumber(number));
        printSymbols(starsQuantity);
        printSymbols(charsQuantity, symbol);
    }
    // число в куб
    static long cubedNumber(int number){
        return (number * number * number);
    }
    // зірочки
    static void printSymbols(int quantity){
        for (int i = 1; i <= quantity; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    // символи
    static void printSymbols(int quantity, char symbol){
        for (int i = 1; i <= quantity; i++) {
            System.out.print(symbol);
        }
        System.out.println("");
    }
}
