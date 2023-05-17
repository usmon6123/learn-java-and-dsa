package uz.ataboyev.learn_java.abstraksiya.abstracts;

public class DSA extends MammalAnimals{

    //abstract classdan extend olinganda uning
    // abstract methodlarini override qilishga majbur bo'linadi
    @Override
    public void voice() {
        //static method va fieldlarini yangi obyekt ochmasdan turib chaqirsa bo'ladi
        int a  = MammalAnimals.abs;
        MammalAnimals.asd(a," dsa");
    }

    @Override
    public void eat() {
        System.out.println();
    }

    @Override
    protected void running(String s) {
        System.out.println("running dsa");
    }

    @Override
    void jumping(String s) {
        System.out.println("jumping dsa");
    }

}
