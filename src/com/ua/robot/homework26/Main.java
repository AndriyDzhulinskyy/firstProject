package com.ua.robot.homework26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        int numberOfThreads = 10;

        List<Callable<String>> callables = new ArrayList<>();

        for (int i = 1; i < 101; i++) {
            callables.add(new RndCallable());
        }

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        List<Future<String>> futures = executorService.invokeAll(callables);

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
    public static class RndCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            return new Random().nextInt(1, 51) + "  " + Thread.currentThread().getName();
        }
    }
}
