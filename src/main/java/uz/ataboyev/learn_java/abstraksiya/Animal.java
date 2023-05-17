package uz.ataboyev.learn_java.abstraksiya;

public interface Animal {

    static void prints(){
        System.out.println("static method Animal's");
    }

    //public abstract bo'lgan methodlar
    void voice();

    void eat();

    void run();
}
