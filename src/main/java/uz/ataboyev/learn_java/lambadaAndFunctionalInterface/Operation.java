package uz.ataboyev.learn_java.lambadaAndFunctionalInterface;

//functional interface deb tarkibida faqat
//bir dona abstract methodi bor bo'lgan interface tushiniladi
//bu java 8 dan qo'shilgan
@FunctionalInterface //Bu anatatsiyani qo'ymasa ham bo'ladi ammo 1 tadan ortiq abstract method yozilganda anatatsiya hatolik berib ogohlantiradi
public interface Operation {

    //yagona abstract method
    boolean isPrime(int n);


// static fieldlar, abstract bo'lmagan methodlar bo'lishi yoki bo'lmasligi
// mumkin FunctionalInterface tarkibida

    public static final int i =2;

    default int j(int s){
        return s;
    }

    private String print(String str){
        return str;
    }
}
