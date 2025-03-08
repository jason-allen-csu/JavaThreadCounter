package Module8;

public class ThreadConcurrency {
    public static void main(String[] args) {
    	System.out.println("Java Concurrency Example");
    	
    	Thread thread1 = new Thread(new CounterUp());
        thread1.start(); // Start first thread

        try {
            thread1.join(); // Wait for thread1 to complete before starting thread2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread2 = new Thread(new CounterDown());
        thread2.start(); // Start second thread
    }
}