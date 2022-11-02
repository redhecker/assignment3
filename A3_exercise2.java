package assignment3;

import java.util.Scanner;

public class A3_exercise2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt(),ans = 0;
        int[][]a = new int[n][n];
        in(a);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j] == 0)continue;
                int x=4;
                if(nei(a,i-1,j,0,n))x--;
                if(nei(a,i+1,j,0,n))x--;
                if(nei(a,i,j-1,0,n))x--;
                if(nei(a,i,j+1,0,n))x--;
                ans += x;
            }
        }
        System.out.print(ans);
    }

    public static void in(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j] = input.nextInt();
            }
        }
    }

    public static boolean nei(int[][]a,int i,int j,int c1,int c2){
        if(j>=c1 && j<c2 && i>=c1 && i<c2){
            return a[i][j] == 1;
        }
        return false;
    }
}
