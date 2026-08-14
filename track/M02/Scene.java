
class Mobile {
    int pass = 123;

    void phone(String name) {
        System.out.println(name);
    }

    void phone(int pass) {
        if (this.pass == pass) {
            System.out.println("call connected");
        } else {
            System.out.println("call not connected");
        }
    }

}

public class Scene {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.phone("sonu");
        m.phone(123);
    }
}
