package uz.ataboyev.learn_java.multiThreading;

import java.util.ArrayList;

public class MultiThreading {
    public static void main(String[] args) {

        //THREAD RUNNABLE FUNCTIONAL INTERFACEDAGI RUN METHODINI ICHIDA YOZILGAN KODNI RUN QILADI
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                ArrayList<String> l = new ArrayList<>();

                String s = "234sdfcytjhfgdghjfmgcf";
                long a = 2;
                try {
                    for (int j = 0; j < 100_000_000_0; j++) {
                        for (int i = 0; i < 100_000_000; i++) {
                            a += 2;
                            s += i + "34567890-=0987654wefbrseawqrg3rwhtyjerseawrq34567890-=0987654  " + Thread.currentThread().getName() + " " + a;
                            System.out.println(s.substring(s.length() - 20));
                            l.add(s);
                            Thread.sleep(10);
                        }

                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // THREADNI BIRINCHI HOSIL QILISH USULI
        Thread thread = new Thread(runnable1);
        thread.start();

        // THREADNI IKKINCHI HOSIL QILISH USULI
        Thread thread1 = new Thread1();
        thread1.start();

        // THREADNI UCHUNCHI HOSIL QILISH USULI
        CustomRunnable run = new CustomRunnable();
        Thread thread3 = new Thread(run);
        thread3.start();

        // THREADNI TO'RTINCHI HOSIL QILISH USULI
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 100_000_000; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread4.start();





    }
}
