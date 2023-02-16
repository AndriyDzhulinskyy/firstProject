package com.ua.robot.homework9;

public class Main {
    public static void main(String[] args) {

//      Student s1 = new Student("Dzh", 20, 'M', "Electronic", 3);
//      System.out.println(s1.getSex());

//      Teacher t1 = new Teacher("Ihor", 30, "Math", "Dph");
//      System.out.println(t1.getName());

        // array creation
        int arraySize = 10;
        int[] array = new int[arraySize];

        // set array numbers range
        int lowBoundOfArray = -100;
        int upperBoundOfArray = 100;

        ArrayMethods.setArray(array, lowBoundOfArray, upperBoundOfArray);
        ArrayMethods.printArray(array);
        ArrayMethods.sortArrayDirect(array);
        ArrayMethods.printArray(array);
        ArrayMethods.sortArrayReverse(array);
        ArrayMethods.printArray(array);

    }
}
