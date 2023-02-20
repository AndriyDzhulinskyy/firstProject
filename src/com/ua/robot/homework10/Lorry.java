package com.ua.robot.homework10;

public class Lorry extends Car {

    private int bodyVolume;

    public int getBodyVolume() {
        return bodyVolume;
    }
    public void setBodyVolume(int bodyVolume) {
        this.bodyVolume = bodyVolume;
    }

//  @Override
    static public String typeOfCar() {
        return "Lorry";
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + "\'" +
                ", color=" + color +
                ", year=" + year +
                ", horsepower=" + horsepower +
                ", body volume=" + bodyVolume +
                "}";
    }
}