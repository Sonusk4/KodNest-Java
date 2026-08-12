class Student {
    int age;
    int height;

    void setValue(int age, int height) {
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(age);
        System.out.println(height);
    }
}

public class shadowing {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setValue(20, 30);
        s1.display();
    }
}