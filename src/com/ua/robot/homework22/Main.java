package com.ua.robot.homework22;

import java.io.*;

public class Main {

    public static final String FILE_NAME = "test.txt";

    public static void main(String[] args) {

        String testString = "likvliuvoiuvlajhsvcsajvckawjevckawejcevwcwekjhv";
        writeToFile(FILE_NAME, testString);
        System.out.println(readFromFile(FILE_NAME));
    }

    public static void writeToFile(String fileName, String text) {

        try (OutputStream outStream = new FileOutputStream(fileName);
             OutputStreamWriter outStreamWrt = new OutputStreamWriter(outStream)) {
            outStreamWrt.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String readFromFile(String fileName) {
        try (InputStream inStream = new FileInputStream(fileName);
        InputStreamReader inStreamRd = new InputStreamReader(inStream)) {
            byte[] data = inStream.readAllBytes();
            return new String(data);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
