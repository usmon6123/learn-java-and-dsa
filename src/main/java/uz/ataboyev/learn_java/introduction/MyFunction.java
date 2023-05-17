package uz.ataboyev.learn_java.introduction;

public interface MyFunction {
    abstract  int a();
    static final int b = 2;
    String s = "";

    default int kvadrat(int n){
        return n*n;
    }

    default int kub(int n){
        return n*n*n;
    }

    int sum(int a, int b);
    int apply(int a, int b);
    int ddd(int a, int b);
}
