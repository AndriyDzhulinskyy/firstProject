package com.ua.robot.homework9;

public class Teacher {
    private String name;
    private int experience;
    private String discipline;
    private String degree;

    public Teacher() {
        System.out.println("Default constructor");
    }

    public Teacher(String name, int experience, String discipline, String degree) {
        this.name = name;
        this.experience = experience;
        this.discipline = discipline;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience (int experience) {
        this. experience = experience;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDescipline(String discipline) {
        this.discipline = discipline;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

}
