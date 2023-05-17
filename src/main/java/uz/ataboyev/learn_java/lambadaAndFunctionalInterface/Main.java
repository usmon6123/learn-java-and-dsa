package uz.ataboyev.learn_java.lambadaAndFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //interfacedan obyekt olish orqali methodiga murojat qilish
        Operation operation = new Operation() {
            @Override
            public boolean isPrime(int n) {
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) return false;
                }
                return true;
            }
        };

        //functional interface ning yagona abstract methodiga lambada orqali murojat qilish
        Operation operation2 = (n) -> {
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) return false;
                }
                return true;
        };

        //note: lambada orqali oddiy interfeysning abstract methodlariga murojat qilib bo'lmaydi

        System.out.println(operation.isPrime(17) ? "17 Tub son" : "17 Tub emas");
        System.out.println(operation2.isPrime(17) ? "17 Tub son" : "17 Tub emas");



//        ----------Javada ishlatilgan Functional interfacelarga misol----------------

        Integer[] nums = new Integer[]{1,23,2,987,4,3,2,5647,21,3,5,65,77,54,32};

        Arrays.sort(nums);
        System.out.println("default Arrays.sort() default:    " + Arrays.toString(nums));

        Integer[] nums2 = new Integer[]{1,23,2,987,4,3,2,5647,21,3,5,65,77,54,32};

        Arrays.sort(nums2,((o1, o2) -> {
            if (o1>o2)return 1;
            else if(o1 == o2) return 0;
            return -1;
        }));

        System.out.println("default Arrays.sort() ascending:  " + Arrays.toString(nums2));

        Integer[] nums3 = new Integer[]{1,23,2,987,4,3,2,5647,21,3,5,65,77,54,32};

        //standart fo'rmasini o'zgartirdik
        Arrays.sort(nums3,((o1, o2) -> {
            if (o1>o2)return -1;
            else if(o1 == o2) return 0;
            return 1; 
        }));

        System.out.println("default Arrays.sort() descending: " + Arrays.toString(nums3));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums3));
        list.forEach(integer -> {if (integer < 100) System.out.print(integer + " ");});



    }
}
