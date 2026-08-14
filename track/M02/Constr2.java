class Student {
    String name;
    int age;
    double height;

    Student() {
        this.name = "Preeti";
        this.age = 20;
        this.height = 5.5;
    }

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

public class Constr2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Rahul", 21, 5.8);
        s2.display();
    }
}
