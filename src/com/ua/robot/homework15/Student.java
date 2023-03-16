package com.ua.robot.homework15;

public class Student {
    private String name;
    private char sex;
    private int age;
    private String faculty;
    private int course;

    public Student() {
        }

    public Student(String name, char sex, int age, String faculty, int course) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.faculty = faculty;
        this.course = course;
    }

    public String getName() {
        return name;
    }

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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString(){
        return "Person {" +
                "name='" + name + "\'" +
                ", sex=" + sex +
                ", age=" + age +
                ", faculty=" + faculty +
                ", course=" + course +
                "}";
    }

}
