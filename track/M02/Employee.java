
class Student {
    int id;
    String name;
}

class Employee {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 20;
        s1.name = "sonu";

        System.out.println(s1.id);
        System.out.println(s1.name);

        Student s2;
        s2 = s1;
        s2.id = 10;
        s2.name = "ankit";
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}