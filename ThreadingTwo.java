class MyTask implements Runnable {

    public void run() {
        // Thread class will call its currentThread method > then with getName we will able to fetch thename of the thread
        // currentThread => static methd - returns referencec to the thread currently running
        // getName => this method returns thread's display name
        // sleep = this method pauses the current thread for a given milliseconds
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); 
            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }
}

public class ThreadingTwo {
    public static void main(String args[]) {
        Thread t1 = new Thread(new MyTask(), "Thread-1");
        Thread t2 = new Thread(new MyTask(), "Thread-2");
        Thread t3 = new Thread(new MyTask(), "Thread-3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("main thread");
    }

}
