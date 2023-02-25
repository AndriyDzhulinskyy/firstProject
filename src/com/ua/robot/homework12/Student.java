package com.ua.robot.homework12;

public class Student extends Person {

    private String faculty;
    private int course;

    public Student(String name, char sex, int age, String faculty, int course) {
        super(name, sex, age);
        this.faculty = faculty;
        this.course = course;
    }
    public String getFaculty() {return faculty;}

    public void setFaculty(String faculty) {this.faculty = faculty;}

    public int getCourse() {return course;}

    public void setCourse(int course) {this.course = course;}

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