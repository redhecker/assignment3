package assignment3;

import java.util.Scanner;
public class A3_exercise3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][]a = new int[202][202];
        int[][]center = new int[203][203];
        int n = input.nextInt();
        double ans = 0;
        double s1 = Math.PI/4 , s2 = Math.PI/6 + Math.sqrt(3)/4;
        for(int i=0;i<n;i++){
            in(a,center);
        }

        for(int[] m : a){
            for(int j : m){
                if(j==1) ans += s1;
                else if(j==2) ans += s2;
                else if(j==3) ans ++ ;
            }
        }

        System.out.printf("%.5f",ans);
    }

    public static void in(int[][]a,int[][]c){
        int i = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        x+=101;y+=101;
        if(i == 2){
            a[x][y] = 3;
            a[x-1][y] = 3;
            a[x-1][y-1] = 3;
            a[x][y-1] = 3;
        }

        if(i == 1){
            c[x][y] = 1;
            if(c[x-1][y-1] == 1) a[x-1][y-1] = 3;
            else if(c[x][y-1] == 1^c[x-1][y] == 1) a[x-1][y-1] = Math.max(a[x-1][y-1],2);
            else a[x-1][y-1] = Math.max(a[x-1][y-1],1);

            if(c[x+1][y+1] == 1) a[x][y] = 3;
            else if(c[x][y+1] == 1^c[x+1][y] == 1) a[x][y] = Math.max(a[x][y],2);
            else a[x][y] = Math.max(a[x][y],1);

            if(c[x-1][y+1] == 1) a[x-1][y] = 3;
            else if(c[x][y+1] == 1^c[x-1][y] == 1) a[x-1][y] = Math.max(a[x-1][y],2);
            else a[x-1][y] = Math.max(a[x-1][y],1);

            if(c[x+1][y-1] == 1) a[x][y-1] = 3;
            else if(c[x][y-1] == 1^c[x+1][y] == 1) a[x][y-1] = Math.max(a[x][y-1],2);
            else a[x][y-1] = Math.max(a[x][y-1],1);
        }

    }
}
