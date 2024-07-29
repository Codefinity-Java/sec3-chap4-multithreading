package com.codefinity;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < 5; i++) {
            new Thread(new Worker(resource, semaphore), "Worker " + (i + 1)).start();
        }
    }
}
