import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the numbers");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println("the array elements are:" + arr[j]);
        }
        sc.close();
    }
}