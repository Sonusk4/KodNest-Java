online
import java.util.Scanner;
class Twod {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int a[][] = new int[3][5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                a[i][j]=sc.nextInt();
            }
        }

          for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

    }
}