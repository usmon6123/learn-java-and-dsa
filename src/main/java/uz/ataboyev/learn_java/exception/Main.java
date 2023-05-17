package uz.ataboyev.learn_java.exception;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static int i = 0;

    public static void main(String[] args) {
        d();
    }

    /**
     * <h1> ArrayIndexOutOfBoundsException </h1>
     **/
    static void d() {
        try {
            int[] numbers = new int[5];
            numbers[10] = 50;
        }catch (Exception e){
            throw RestException.arrayIndexOutOfBoundsException(e.getMessage());
        }
        System.out.println("sssssssssss");
    }

    /**
     * <H1>HEAP HOTIRANI TO'LDIRIB TASHLADIK :) VA OUTOFMEMORYERROR TASHLADI </H1>
     **/
    static void c() {
        String s = "salom";
        List<String> list = new ArrayList<>();
        for (int j = 0; j < 1_000_000; j++) {
            s += j;
            list.add(s);
        }
    }


    /**
     * <H2>a() VA b() METHODLAR BIR BIRINI CHEKSIZ CHAQIRGANIUCHUN STACK TO'LIB QOLIB
     * STACKOVERFLOWERROR TASHLADI
     * HAR BIR METHOD UCHUN YANGI STACK OCHILADI XOTIRADA </H2>
     **/
    static void a() {
        i++;
        System.out.println(i);
        b();

    }

    static void b() {
        i++;
        a();
    }
}
