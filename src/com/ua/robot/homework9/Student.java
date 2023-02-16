package com.ua.robot.homework9;

public class Student {
    private String name;
    private int age;
    private char sex;
    private String faculty;
    private int course;

    public Student() {
        System.out.println("Default constructor");
    }

    public Student(String name, int age, char sex, String faculty, int course) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.faculty = faculty;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(byte course) {
        this.course = course;
    }

}
