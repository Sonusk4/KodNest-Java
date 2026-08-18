package Array;

class Fre {
    int count = 0;

    void freq(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                count++;
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        Fre f = new Fre();
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;
        f.freq(a, key);
        System.out.println("the frequency of " + key + " is " + f.count);
    }
}