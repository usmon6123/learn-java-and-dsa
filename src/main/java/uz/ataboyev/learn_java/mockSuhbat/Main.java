package uz.ataboyev.learn_java.mockSuhbat;

public class Main {
    public static void main(String[] args) {
        String hello = "salom ";
        StringBuilder sb = new StringBuilder();
        sb.append("salom ");
        world(hello,sb);
        System.out.println("main method: " + hello + "\t sb: " + sb);
    }

    private static void world(String str,StringBuilder sb) {
        str+= "world!";
        sb.append("world");
        System.out.println("world method: " + str + "\t sb: " + sb);
    }
}
