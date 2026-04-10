package org.example;

import java.util.concurrent.*;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        H2O h2o = new H2O();

        Runnable releaseH = () -> System.out.print("H");
        Runnable releaseO = () -> System.out.print("O");

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++)
                executor.submit(() -> {
                    try { h2o.hydrogen(releaseH); }
                    catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                });
            for (int i = 0; i < 5; i++) {
                executor.submit(() -> {
                    try { h2o.oxygen(releaseO); }
                    catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                });
            }
        }
    }
}

class H2O {
    private final Semaphore hydrogen = new Semaphore(2);
    private final Semaphore oxygen = new Semaphore(0);

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hydrogen.acquire();
        releaseHydrogen.run();
        oxygen.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxygen.acquire(2);
        releaseOxygen.run();
        hydrogen.release(2);
    }
}