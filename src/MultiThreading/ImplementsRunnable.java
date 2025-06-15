package MultiThreading;

public class ImplementsRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running iteration " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted: " + e.getMessage());
            }
        }
    }
}
