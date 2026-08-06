package track.M02;

public class labelledloop {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 4; i++) {
            inner: for (int j = 0; j <= 3; j++) {
                System.out.println(j);
                if (i == 3) {
                    break outer;
                }
            }

        }

    }
}
