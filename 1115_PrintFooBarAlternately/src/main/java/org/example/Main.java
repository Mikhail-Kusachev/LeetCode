package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FooBar fooBar = new FooBar(300);

        Thread threadA = createThread(fooBar::foo, "foo");
        Thread threadB = createThread(fooBar::bar, "bar\n");

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
    }

    private static Thread createThread(ThrowingRunnable task, String output) {
        return new Thread(() -> {
            try {
                task.run(() -> System.out.print(output));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Thread interrupted while printing " + output, e);
            }
        });
    }

    @FunctionalInterface
    private interface ThrowingRunnable {
        void run(Runnable print) throws InterruptedException;
    }
}