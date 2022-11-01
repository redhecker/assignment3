package assignment3;

import java.util.Scanner;
public class A3_exercise1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();

        int[][]a1 = new int[n/2][n/2];
        int[][]a2 = new int[n/2][n/2];
        int[][]a3 = new int[n/2][n/2];
        int[][]a4 = new int[n/2][n/2];
        enter(a1,a2,a3,a4);

        int[][]b1 = new int[n/2][n/2];
        int[][]b2 = new int[n/2][n/2];
        int[][]b3 = new int[n/2][n/2];
        int[][]b4 = new int[n/2][n/2];
        enter(b1,b2,b3,b4);

        int[][]ans1 = And(a1,b1);
        int[][]ans4 = Sub(a4,b4);
        int[][]ans2 = tim(a2,b2);
        int[][]ans3 = tim(a3,b3);
        swi(ans3);

        print(ans1,ans2,ans3,ans4);
    }

    public static void enter(int[][]m1,int[][]m2,int[][]m3,int[][]m4){
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1.length;j++){
                m1[i][j] = input.nextInt();
            }
            for(int j=0;j<m1.length;j++){
                m2[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1.length;j++){
                m3[i][j] = input.nextInt();
            }
            for(int j=0;j<m1.length;j++){
                m4[i][j] = input.nextInt();
            }
        }
    }

    public static int[][] And(int[][]a,int[][]b){
        int[][]m = new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                m[i][j] = a[i][j] + b[i][j];
            }
        }
        return m;
    }

    public static int[][] Sub(int[][]a,int[][]b){
        int[][]m = new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                m[i][j] = a[i][j] - b[i][j];
            }
        }
        return m;
    }

    public static int[][] tim(int[][]a,int[][]b) {
        int[][] n= new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++) {
                    n[i][j] += a[i][k]*b[j][k];
                }
            }
        }
        return n;
    }

    public static void print(int[][]a,int[][]b,int[][]c,int[][]d){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            for(int j=0;j<a.length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(c[i][j]+" ");
            }
            for(int j=0;j<a.length;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void swi(int[][]a){
        int n;
        for(int i=0;i<a.length;i++) {
            for (int j = i; j < a.length; j++) {
                n = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = n;
            }
        }
    }
}