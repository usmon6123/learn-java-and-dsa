package uz.ataboyev.learn_java.multiThreading;

import lombok.SneakyThrows;

public class CustomRunnable implements Runnable{
    @SneakyThrows
    @Override
    public void run() {
        String s = "t ";
        for (int i = 0; i < 100_000_000; i++) {
            s+=i+" ";
            System.out.println(s);
            Thread.sleep(100);
        }
    }
}
