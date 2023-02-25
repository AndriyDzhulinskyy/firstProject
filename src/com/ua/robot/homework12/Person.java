package com.ua.robot.homework12;

public abstract class Person {

    protected String name;
    protected char sex;
    protected int age;

    public Person() {}
    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person {" +
                "name='" + name + "\'" +
                ", sex=" + sex +
                ", age=" + age +
                "}";
    }
}