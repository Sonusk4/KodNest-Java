public // Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class ThreeD {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Scanner sc=new Scanner(System.in);
        int a[][][]=new int[3][3][5];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=sc.nextInt();
                }
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                }
                 System.out.println();

            }
             System.out.println();
        }

}
