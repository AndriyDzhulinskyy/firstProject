package com.ua.robot.homework10;

//import

public class Main {
    public static void main(String[] args) {

        PassengerCar p1 = new PassengerCar();
        p1.setModel("BMW");
        p1.setColor("black");
        p1.setYear(2020);
        p1.setHorsepower(200);
        p1.setSeats(5);

        Lorry l1 = new Lorry();
        l1.setModel("Volvo");
        l1.setColor("Green");
        l1.setYear(2010);
        l1.setHorsepower(800);
        l1.setBodyVolume(15);

        System.out.println(p1);
        System.out.println(l1);
        System.out.println(Car.typeOfCar());
        System.out.println(PassengerCar.typeOfCar());
        System.out.println(Lorry.typeOfCar());
    }
}
