package com.ua.robot.homework25;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Thread tr = new Thread(new ThreadInterrupt());
        tr.start();
    }

    public static class ThreadInterrupt implements Runnable {
        private boolean flag = true;
        private Random rnd = new Random();

        @Override
        public void run() {
            while (flag) {

                int rndInt = rnd.nextInt(1, 11);
                System.out.println(rndInt);

                if (rndInt == 5) {
                    Thread.currentThread().interrupt();
                    flag = false;
                }

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}

