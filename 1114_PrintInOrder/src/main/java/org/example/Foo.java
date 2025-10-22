package org.example;

import java.util.concurrent.CountDownLatch;

public class Foo {
    private final CountDownLatch firstLatch = new CountDownLatch(1);
    private final CountDownLatch secondLatch = new CountDownLatch(1);

    public void first(Runnable printFirst) {
        printFirst.run();
        firstLatch.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        firstLatch.await();
        printSecond.run();
        secondLatch.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        secondLatch.await();
        printThird.run();
    }
}

//// Random order demonstration
//public class Foo {
//    public void first(Runnable printFirst) {
//        printFirst.run();
//    }
//
//    public void second(Runnable printSecond)  {
//        printSecond.run();
//    }
//
//    public void third(Runnable printThird) {
//        printThird.run();
//    }
//}