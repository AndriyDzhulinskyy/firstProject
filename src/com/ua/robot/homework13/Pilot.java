package com.ua.robot.homework13;

public class Pilot extends Human implements Flying {

    public void abc() {
        System.out.println("abc");
    }
    @Override
    public void flying() {
        System.out.println("Pilot is flying");
    }
}
