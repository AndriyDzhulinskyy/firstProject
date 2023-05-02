package com.ua.robot.homework24;

public class Main {
    public static void main(String[] args) {

        ThreadRunnable tr = new ThreadRunnable();

        Thread thread0 = new Thread(tr);
        Thread thread1 = new Thread(tr);

        thread0.start();
        thread1.start();
    }
    public static class ThreadRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i < 11; i++) {
                System.out.println("Number " + i + " of " + Thread.currentThread().getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
