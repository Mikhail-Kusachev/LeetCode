package org.example;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IntConsumer printNumber = x -> System.out.print(x);
        ZeroEvenOdd obj = new ZeroEvenOdd(5);

        for (int run = 1; run <= 10; run++) {
            Thread[] threads = new Thread[] {
                    new Thread(() -> runSafe(() -> obj.zero(printNumber))),
                    new Thread(() -> runSafe(() -> obj.even(printNumber))),
                    new Thread(() -> runSafe(() -> obj.odd(printNumber)))
            };
            for (Thread t : threads) t.start();
            for (Thread t : threads) t.join();
            System.out.println();
        }
    }

    static void runSafe(ThrowingRunnable r) {
        try {
            r.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @FunctionalInterface
    interface ThrowingRunnable {
        void run() throws InterruptedException;
    }
}

class ZeroEvenOdd {
    private int n;
    private Semaphore zero = new Semaphore(1);
    private Semaphore even = new Semaphore(0);
    private Semaphore odd = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            zero.acquire();
            printNumber.accept(0);
            if (i % 2 == 1) {
                odd.release();
            } else {
                even.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            even.acquire();
            printNumber.accept(i);
            zero.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            odd.acquire();
            printNumber.accept(i);
            zero.release();
        }
    }
}