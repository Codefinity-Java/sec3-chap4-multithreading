package com.codefinity;

public class Resource {
    public void use() {
        System.out.println(Thread.currentThread().getName() + " is using the resource.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + " has finished using the resource.");
    }
}
