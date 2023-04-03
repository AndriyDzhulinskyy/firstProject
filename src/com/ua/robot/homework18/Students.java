package com.ua.robot.homework18;

public class Students {
    String surname;
    int age;

    public Students(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
