package uz.ataboyev.learn_java.abstraksiya.abstracts;

import uz.ataboyev.learn_java.abstraksiya.Animal;

//interfacedan implement olganda uning methodlarini override qilishga majburlamaydi
public abstract class MammalAnimals implements Animal {

    //istalgan turdagi fieldlarni ochishga ruhsat beradi
    public static final int abs = 9;
    private String name;
    protected Integer childCount;
    public String familyName;

    //bodysiz abstract methodlar ochish mumkin
    protected abstract void running(String s);
    abstract void jumping(String s);

    //bodyga ega istalgan modifikatorli methodlar ochish mumkin
    public String voice(String voice){
        System.out.println(voice);
        return voice;
    }
    protected Integer ads(int a){
        return a;
    }
    private Integer dsa(int b){
        return b;
    }

    //static method ham mumkin
    public static void asd(Integer a,String s){
        System.out.println(s + "  " + a);
    }

    @Override
    public void run() {
        System.out.println("mammal animal runs");
    }

    //constructor ham ochsa bo'ladi
    public MammalAnimals() {
    }

    public MammalAnimals(String name, Integer childCount, String familyName) {
        this.name = name;
        this.childCount = childCount;
        this.familyName = familyName;
    }

    public MammalAnimals(String name, Integer childCount) {
        this.name = name;
        this.childCount = childCount;
    }
}
