package uz.ataboyev.learn_java.multiThreading;

public class ThreadGroups {
    public static void main(String[] args) throws InterruptedException {

        //threadlarni guruhga yig'ish uchun
        ThreadGroup threadGroup = new ThreadGroup("myGroup");


        Runnable runnable1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread 1 " + i + " ");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(threadGroup, runnable1);


        Thread thread1 = new Thread(threadGroup, () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("thread 2 " + i + " ");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        //Bu setDaemon(true) bo'lmagan threadlarning barchashi o'zvazifasini tugatib bo'lsa bu ham ular bn birga o'chadi
        thread.setDaemon(true);
        thread1.setDaemon(true);

        //THREADLARNI ISHLATYAPMIZ
        thread.start();

        //BU O'ZIDAN KEYINGI THREADNI 1000 MILLISEQ KUTTURIB KEYIN ISHLATTIRADI <<JOIN(1000)>>,
        //AGAR <<JOIN()>> BO'LSA THREAD ISHINI TUGATGAN SO'NG THREAD1 ISHINI BOSHLAYDI
        thread.join();
        //JOIN QO'YILGAN QATORDAN PASTDAGI THREADLAR VAZIFASINI BAJARA OLMAYDI, JOIN BOSHQA THREADLARNI O'ZIGA QARAM QILADI

        thread1.start();
        Thread.currentThread().getThreadGroup().list();



        System.out.println("active : " + threadGroup.activeCount());
        System.out.println("name : " + threadGroup.getName());

//
        while (threadGroup.activeCount() != 0) {
            threadGroup.list();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
