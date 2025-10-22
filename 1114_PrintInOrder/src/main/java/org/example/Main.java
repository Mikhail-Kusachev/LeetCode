package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Thread t1 = createInterruptibleThread(
                () -> foo.first(() -> System.out.println("printFirst: 1"))
        );
        Thread t2 = createInterruptibleThread(
                () -> foo.second(() -> System.out.println("printSecond: 2"))
        );
        Thread t3 = createInterruptibleThread(
                () -> foo.third(() -> System.out.println("printThird: 3"))
        );

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }

    private static Thread createInterruptibleThread(InterruptibleTask task) {
        return new Thread(() -> {
            try {
                task.run();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Thread interrupted", e);
            }
        });
    }

    @FunctionalInterface
    private interface InterruptibleTask {
        void run() throws InterruptedException;
    }
}