public import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int[][] a = new int[row][col];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            int total = 0;
            for (int j = 0; j < a[i].length; j++) {
                total += a[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + total);
        }
        
        sc.close();
    }
} matrix {
    
}
