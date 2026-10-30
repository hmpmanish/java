/**
 * Experiment 28: Write a Java program to create and execute a thread by extending the Thread class.
 * 
 * Objective: Understand multithreading in Java by extending the Thread class and overriding run().
 */

class WorkerThread extends Thread {
    private String threadName;

    WorkerThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Thread started: " + threadName);
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("[" + threadName + "] Count: " + i);
                Thread.sleep(500); // 500 ms pause
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + threadName);
        }
        System.out.println("Thread finished: " + threadName);
    }
}

public class Exp28_ThreadClass {
    public static void main(String[] args) {
        System.out.println("=== Experiment 28: Multithreading by Extending Thread Class ===");

        WorkerThread t1 = new WorkerThread("Worker-1");
        WorkerThread t2 = new WorkerThread("Worker-2");

        // Starting both threads concurrently
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both worker threads have finished. Main thread ends.");
    }
}
