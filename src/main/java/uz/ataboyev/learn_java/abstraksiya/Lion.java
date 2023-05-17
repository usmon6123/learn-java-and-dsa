package uz.ataboyev.learn_java.abstraksiya;


/** implelimet olingan interfacening barcha methodlarini
override qilishga majbur bo'ladi class
sababi Interface barcha impeliment olgan claslar
uchun majburiy shablon vazifasini bajaradi **/
public class Lion implements Animal{

    public void jumping(){
        System.out.println("Lion jumps");
    }

    @Override
    public void voice() {
        System.out.println("Lion voices");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats");
    }

    @Override
    public void run() {
        System.out.println("Lion runs");

    }
}
