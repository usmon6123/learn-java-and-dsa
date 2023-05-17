package uz.ataboyev.learn_java.mockSuhbat;

public class CastingParsing {
    public static void main(String[] args) {

        String str = "1234567898765434567";
        int i = 34567890;
        double d= 1234.456d;
        float f = 7654.765f;
        long l = 7654324356L;
        Double D = 3532145d;
        Float F= 45467.98F;
        Long L = 345678957L;
        Integer I = 67546352;

        Float test1 = Float.parseFloat(str);
        f = (float) d;
//        f = (float) D;//cast qilolmas ekan
        d = f;
        d = F;
        l =  i;
        i = (int) l;
//        I = L; bo'lmaydi
        i = (int) f;

    }

    // Xulosa qilib aytganda cast numeric typlar orasida bo'ladi
    // parse esa String dan numeric typlarga parsa qilish uchun
}
