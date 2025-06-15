package MultiThreading;

public class tesstThreads {
    public static void main(String[] args) {
        // Create a thread using the ImplementsRunnable class
        ImplementsRunnable runnable = new ImplementsRunnable();
        Thread thread1 = new Thread(runnable, "RunnableThread");

        // Create a thread using the ExtendsThreads class
        ExtendsThreads threads = new ExtendsThreads();
        Thread thread2 = new Thread(threads, "ExtendsThread");
        // OR simply use -> ExtendsThreads thread2 = new ExtendsThreads();

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread was interrupted: " + e.getMessage());
        }

        System.out.println("Both threads have finished execution.");
    }
}
