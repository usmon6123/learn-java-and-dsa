package uz.ataboyev.learn_java.abstraksiya;

public class Algebra implements Mathematics{




    //default methodlarni override qilish hohishiy
    @Override
    public int sum(int a, int b) {
        return 0;
    }

    //abstract methodlarni majburiy override qiladi
    @Override
    public int length(int a) {
        return a;
    }

    @Override
    public double space(int a) {
        Mathematics.print(a);
        return 0;
    }

    @Override
    public float square(int a) {
        return 0;
    }
}
