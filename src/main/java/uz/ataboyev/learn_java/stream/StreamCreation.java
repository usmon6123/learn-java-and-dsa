package uz.ataboyev.learn_java.stream;

import uz.ataboyev.learn_java.introduction.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;


public class StreamCreation {
    public static void main(String[] args) {

        /** BO'SH STREAM HOSIL QILISH: BU STREAMLARNI YIG'ISH UCHUN QO'LLANILADI
         *AMMO ADD QILIB MALUMOT QO'SHIB BO'LMAYDI **/
        Stream<String> stringStream = Stream.empty();

        //1) COLLECTIONLARDAM STREAM YASASH
        Stream<String> collectionStream = List.of("a", "b", "c", "d").stream();

        //EMPTY STREAMGA COLLECTION STREAMNI QO'SHYAPMIZ
        stringStream = Stream.concat(collectionStream, stringStream);

        Scanner scanner = new Scanner(System.in);
        System.out.print("qandaydir gap yozing -> ");
        String[] arr = scanner.nextLine().split(" ");

        //STREAM.CONCAT BIRINCHI YOZILGAN STREAM ORQASIGA IKKINCHI YOZILGAN STREAMNI QO'SHIB BERARKAN
        stringStream = Stream.concat(Arrays.stream(arr),stringStream);

        //STREAM.BUILDER ORQALI MALUMOT QOSHISH
        Stream.Builder<String> stringBuilder = Stream.builder();
        stringBuilder.add("111sagghbj").add("222ghdsjck").add("333ewdbsawvb");

        //BU YERDA STRINGBUILDERGA "111", "SALOM" NI QO'SHIB SALOMNI BIRINCHI CHOP ETYAPDI
        stringBuilder.add("111").andThen(System.out::print).accept("salom\n");

        stringStream = Stream.concat(stringStream,stringBuilder.build());


        // KIRUVCHI PARAMETRI YOQ AMMO SORALGAN TYPDA
        //CHEKSIZ BIR XIL YOKI RANDOM QIYMAT GENERATSIYA QILIB BERUVCHI FUNKISIYA
        //LIMIT ORQALI GENERATSIYANI TO'XTATAMIZ
        Random random = new Random();
        Stream<String> generateStream = Stream.generate(() -> "s21").limit(5);
        stringStream = Stream.concat(stringStream,generateStream);

        stringStream.forEach(System.out::println);

        // 1 - kiruvchi s ning boshlang'ich qiymati(seed)
        // 2 - s kiruvchi parametr va u T type return qilinadigan qiymat ham T type bo'ladi
        Stream<String> streamIterate1 = Stream.iterate("s", (s) -> s += s).limit(10);
        streamIterate1.forEach(System.out::println);

        Stream<Long> streamIterate1_2 = Stream.iterate(2l, (s) -> s *= s).limit(5);
        streamIterate1_2.forEach(System.out::println);

        //SEED (2)  - KIRUVCHI PARAMETRNING BOSHLANG'ICH QIYMATI
        // 2-QISMGA SHART YOZILADI SHARTNI QANOATLANTIRGUNGACHA ITERATSIYA QILIBERADI
        // 3-QISMDA KIRGAN PARAMETRGA ISHLOV BERILIB QAYTARILYAPDI
        Stream<Integer> streamIterator2 = Stream.iterate(2, (s) -> s <= 10, (t) -> t += 2).limit(15);
        streamIterator2.forEach(System.out::println);


    }
}
