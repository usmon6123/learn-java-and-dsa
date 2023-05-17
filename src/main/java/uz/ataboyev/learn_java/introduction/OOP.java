package uz.ataboyev.learn_java.introduction;

public class OOP {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("foo");
        String s4 = s1.intern();
        //intern() heapda saqlangan stringni stringpoolda nusxasini yaratadi, stringpoolda bor bo'lsa uning adresiga biriktiradi
        String s5 = s2.intern();

        s1.toUpperCase();

        System.out.println(s3 == s4);
        System.out.println(s1 == s5);

        Student student = new Student();

        student.age = 22;
        System.out.println(student.age + "   "+student.name + "  " + student.courses);

        Student student2 = new Student();
        System.out.println(student2.age + "   "+student2.name + "  " + student2.courses);
    }
}
