package com.ua.robot.homework10;

public class PassengerCar extends Car {

    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String typeOfCar() {
        return "Passenger Car";
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + "\'" +
                ", color=" + color +
                ", year=" + year +
                ", horsepower=" + horsepower +
                ", seats=" + seats +
                "}";
    }
}