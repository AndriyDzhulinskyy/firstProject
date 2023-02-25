package com.ua.robot.homework12;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Iryna", 'F', 18, "electronics",2);
        Teacher t1 = new Teacher("Dmytro", 'M', 42, 15, "Math", "PhD");

     // Person p1 = new Person();  для перевірки що не працює

        System.out.println(s1);
        System.out.println(t1);
      //System.out.println(p1);
    }
}