package track.M02;

public class nestedforwithcontinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3)
                    continue;
                System.out.println(j);
            }
            System.out.println();
        }
    }
}
