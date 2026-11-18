/**
 * JAVA PRACTICAL END-SEMESTER EXAMINATION
 * Program 28: Multithreading
 * 
 * Question:
 * Write a Java program to create and execute a thread by extending the Thread class.
 */

// Custom Thread Class extending java.lang.Thread
class TaskThread extends Thread {
    private String threadTitle;

    public TaskThread(String title) {
        this.threadTitle = title;
    }

    @Override
    public void run() {
        System.out.println("[" + threadTitle + "] started execution.");
        try {
            for (int i = 1; i <= 4; i++) {
                System.out.println("  -> [" + threadTitle + "] Processing iteration " + i);
                Thread.sleep(400); // Sleep for 400 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("[" + threadTitle + "] was interrupted: " + e.getMessage());
        }
        System.out.println("[" + threadTitle + "] completed execution.");
    }
}

public class Program28_ThreadClass {
    public static void main(String[] args) {
        System.out.println("--- Program 28: Multithreading by Extending Thread Class ---\n");

        TaskThread thread1 = new TaskThread("Worker-Thread-A");
        TaskThread thread2 = new TaskThread("Worker-Thread-B");

        // Invoking start() creates a new call stack and triggers run() concurrently
        System.out.println("Starting threads concurrently...");
        thread1.start();
        thread2.start();

        try {
            // Main thread waits for both threads to complete
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\n>>> Both concurrent threads finished. Main thread terminates. <<<");
    }
}

/*
 * DEMONSTRATION OF OUTPUT:
 * ----------------------------------------------------
 * --- Program 28: Multithreading by Extending Thread Class ---
 * 
 * Starting threads concurrently...
 * [Worker-Thread-A] started execution.
 * [Worker-Thread-B] started execution.
 *   -> [Worker-Thread-A] Processing iteration 1
 *   -> [Worker-Thread-B] Processing iteration 1
 *   -> [Worker-Thread-A] Processing iteration 2
 *   -> [Worker-Thread-B] Processing iteration 2
 *   -> [Worker-Thread-A] Processing iteration 3
 *   -> [Worker-Thread-B] Processing iteration 3
 *   -> [Worker-Thread-A] Processing iteration 4
 *   -> [Worker-Thread-B] Processing iteration 4
 * [Worker-Thread-A] completed execution.
 * [Worker-Thread-B] completed execution.
 * 
 * >>> Both concurrent threads finished. Main thread terminates. <<<
 */
