import java.util.Scanner;

public class ArrSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the elements");
        for (int i = 0; i < 5; i++) {

            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}