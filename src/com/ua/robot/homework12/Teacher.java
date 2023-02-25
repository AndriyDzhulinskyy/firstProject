package com.ua.robot.homework12;

public class Teacher extends Person {

    private int experience;
    private String discipline;
    private String scienceDegree;

    public Teacher(String name, char sex, int age, int experience, String discipline, String scienceDegree) {
        super(name, sex, age);
        this.experience = experience;
        this.discipline = discipline;
        this.scienceDegree = scienceDegree;
    }

    public int getExperience() {return experience;}

    public void setExperience(int experience) {this.experience = experience;}

    public String getDiscipline() {return discipline;}

    public void setDiscipline(String discipline) {this.discipline = discipline;}

    public String getScienceDegree() {return scienceDegree;}

    public void setScienceDegree(String scienceDegree) {this.scienceDegree = scienceDegree;}

    @Override
    public String toString(){
        return "Person {" +
                "name='" + name + "\'" +
                ", sex=" + sex +
                ", age=" + age +
                ", experience=" + experience +
                ", discipline=" + discipline +
                ", scienceDegree=" + scienceDegree +
                "}";
    }
}