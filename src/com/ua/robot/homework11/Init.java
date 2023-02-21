package com.ua.robot.homework11;

public class Init {

    static private byte i = 1;
    public Init() {
        System.out.println("Step " + i++ + ". Constructor.");
    }

    {
        System.out.println("Step " + i++ + ". Init block.");
    }
    public static void Blind() { // Для експерименту!!!!!!!!!!!!!!!!!!!
        System.out.println("Blind method.");
    }

    static {
        System.out.println("Step " + i++ + ". Static init block.");
    }
}
