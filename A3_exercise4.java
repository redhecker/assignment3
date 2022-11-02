package assignment3;

import java.util.Scanner;

public class A3_exercise4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int[][]a = new int[n1][n2];

        enter(a);
//        int[][] x = swit(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i][0]);
            for(int j=1;j<a[0].length;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }

    public static void enter(int[][]a){
        boolean[][]boo = new boolean[a.length][a[0].length];
        int m=0,n=0;
        for(int i=0 ;i<Math.min(a.length,a[0].length)/2 + 1;i++){
            for(int p = n ;p < a.length - i - 1 && m < a.length && n < a[0].length; p++ , n++){
                a[m][n] = input.nextInt();
                boo[m][n] = true;
            }
            for(int p = m ;p < a[0].length - i -1 && m < a.length && n < a[0].length; p++ , m++){
                a[m][n] = input.nextInt();
                boo[m][n] = true;
            }
            for(int p = n ;p > i && m < a.length && n < a[0].length; p-- , n--){
                a[m][n] = input.nextInt();
                boo[m][n] = true;
            }
            for(int p = m ;p > i && m < a.length && n < a[0].length; p-- , m--){
                a[m][n] = input.nextInt();
                boo[m][n] = true;
            }
            m++;n++;
        }
        for(int i=0;i<boo.length;i++){
            for(int j=0;j<boo[0].length;j++){
                if(boo[i][j])continue;
                a[i][j] = input.nextInt();
            }
        }

    }
    public static int[][] swit(int[][]a){
        int[][]m = new int [a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a[0].length;j++){
                a[i][j] = a[i][j];
            }
        }
        return m;
    }
}
