
class Student {
    int age;
    String name;
    int height;

    void sleep() {
        System.out.println("sleeping");
    }
}

public class StudentApplication {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "sonu";
        s1.height = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);
        s1.sleep();
    }
}