package com.csen160.FinalImplementationExamples;

class SharedResource {
    private volatile boolean running = true;
    public void stop() {
        running = false;
    }
    public boolean isRunning() {
        return running;
    }
}
public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        
        Thread thread = new Thread(() -> {
            while (resource.isRunning()) {}
            System.out.println("Thread stopped.");
        });

        thread.start();
        Thread.sleep(1000); // Simulate some work
        resource.stop();    // Stop the thread
        thread.join();
    }
}