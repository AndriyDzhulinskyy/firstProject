package com.ua.robot.homework23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static final String FILE_NAME = "newtest.txt";
    public static final String TEST_STRING = "kjvhkjcehkjehrchjeavfkhawevfkjvacljavckjvweckjw";

    public static void main(String[] args) {

        Path path = Path.of(FILE_NAME);

        try {
            Files.writeString(path, TEST_STRING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Files.readAllLines(path).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
