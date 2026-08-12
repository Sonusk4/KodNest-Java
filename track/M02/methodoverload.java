package track.M02;

class Overloads {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class methodoverload {

    public static void main(String[] args) {
        Overloads o = new Overloads();
        System.out.println(o.add(1, 2));
        System.out.println(o.add(1.2, 2.3));
        System.out.println(o.add(1.0, 2));
    }
}
