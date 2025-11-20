class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(5000); // Sleep for 500 milliseconds
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class ThreadingOne {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("main thread");
    }
}