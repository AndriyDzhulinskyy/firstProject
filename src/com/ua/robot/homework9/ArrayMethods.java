package com.ua.robot.homework9;

import java.util.Random;
public class ArrayMethods {
    // array setting
    static void setArray(int[] array, int low, int upper){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(low, upper);
        }
    }

    static void sortArrayDirect(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    static void sortArrayReverse(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // array printing
    static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
