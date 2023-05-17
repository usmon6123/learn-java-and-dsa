package uz.ataboyev.learn_java.abstraksiya;

public interface Mathematics {

    //public static final fields
    double e = 1.6;
    public static final double Pi = 3.14;


    //public default methods with body from java 8+ (bodysi yoziladi bu methodlarni)
    default int sum(int a,int b){
        return a+b;
    };

    public default int difference(int a,int b){
        int d = max(a,b);
        return d==a ? a-b : b-a;
    };


    //private methodlar default methodlarga yordam berish uchun ishlatiladi override qilinmaydi
    private int max(int a,int b){
        return Math.max(a, b);
    }


    //static methods with body from java 8+
    public static void print(int num){
        System.out.println(" \'"+ num +"\' ");
    }


    //public abstract methods
    int length(int a);
    double space(int a);
    public abstract float square(int a);

}
// static fields
// abstract va private methods with body
// static methods with body
// abstract methods

//static fieldlar va methodlardan foydalanish uchun implementet olishi shart emas class
//static methodlarning bodysini o'zgartirib bo'lmaydi ham
//hamda bu field va methodlardan boshqa sinflarning methodlari ichida foydalanilishi mumkin

//abstract methodlarni override qilish hohishi bo'ladi
//agar override qilinsa  bodysi o'sha implement olgan classda qayta yoziladi

