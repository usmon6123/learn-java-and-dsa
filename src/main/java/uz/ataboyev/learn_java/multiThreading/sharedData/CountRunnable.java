package uz.ataboyev.learn_java.multiThreading.sharedData;

public class CountRunnable implements Runnable{

    //thread shared data bo'lyapdi count bizda yani barcha threadlar bitta countdan foydalanyapdi
    int count = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 1_000_000; i++) {
                count++;
            }
        }

        System.out.println(count);
    }
}
