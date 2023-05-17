package uz.ataboyev.learn_java.multiThreading.sharedData;

public class Threads {
    public static void main(String[] args) {
        Runnable countRunnable = new CountRunnable();
        Thread thread = new Thread(countRunnable);
        Thread thread2 = new Thread(countRunnable);
        Thread thread3 = new Thread(countRunnable);


        thread.start();
        thread2.start();
        thread3.start();
    }
}
