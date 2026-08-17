class Robot {
    // No-argument constructor
    Robot() {
        System.out.println("Beep beep! Robot reporting for Java duty!");
    }
}

public class constr {
    public static void main(String[] args) {
        // Creating a Robot object automatically calls the constructor
        Robot r = new Robot();
    }
}