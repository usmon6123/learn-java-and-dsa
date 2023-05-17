package uz.ataboyev.learn_java.introduction;

public class Student {

    //fields
    int age;
    String name = "Jamshid";
    int courses;


    //constructor
    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }
}
