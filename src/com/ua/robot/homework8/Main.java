package com.ua.robot.homework8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // array creation
        int arraySize = 10;
        int[] array = new int[arraySize];

        // set array numbers range
        int lowBoundOfArray = -100;
        int upperBoundOfArray = 100;

        setArray(array, lowBoundOfArray, upperBoundOfArray); // method to set array elements
        printArray(array); // method to print array in console
        minElementOfArray(array); // minimum element of array
        maxElementOfArray(array); // maximum element of array
        averageValue(array); // average value of array elements
        sumOfArrayNumbers(array); // sum of array elements

    }

        // array setting
        static void setArray(int[] array, int low, int upper){
            Random random = new Random();
            for (int i = 0; i < array.length; i++){
                array[i] = random.nextInt(low, upper);
            }
        }

        // array printing
        static void printArray(int[] array){
            System.out.print("Random array of " + array.length + " elements is [ ");
            for (int i : array){
                System.out.print(i + " ");
            }
            System.out.println("]");
        }

        // minimum element of array
        static int minElementOfArray(int array[]){
            int min = array[0];
            for (int i : array){
                if (min >= i) {
                    min = i;
                }
            }
            // System.out.println("min = " + min);
            return min;
        }

        // maximum element of array
        static int maxElementOfArray(int array[]){
            int max = array[0];
            for (int i : array){
                if (max <= i) {
                    max = i;
                }
            }
            // System.out.println("max = " + max);
            return max;
        }
        // average value of array
        static float averageValue(int array[]){
            float sum = 0;
            for (int i : array){
                sum += i;
            }
            // System.out.println("average = " + sum / array.length);
            return (sum / array.length);
        }

        // sum of array numbers
        static int sumOfArrayNumbers(int array[]){
            int sum = 0;
            for (int i : array){
                sum += i;
            }
            // System.out.println("sum = " + sum);
            return (sum);
        }
}