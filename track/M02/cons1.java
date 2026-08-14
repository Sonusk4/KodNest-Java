package pratice;

class Student {
    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("name" + name);
        System.out.println("age" + age);
        System.out.println("height" + height);
    }
}

public class cons1 {
    public static void main(String[] args) {
        Student s1 = new Student("Preeti", 20, 5.5);
        s1.display();
    }
}
