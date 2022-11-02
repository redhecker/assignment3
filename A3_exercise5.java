package assignment3;

import java.util.Scanner;

public class A3_exercise5 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt(),y=0;
        boolean[][]p = new boolean[n][n];
        boolean[][]q = new boolean[n][n];
        in(p);
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p.length;j++){
                if(!p[i][j]){
                    test(p,q,i,j);
                }
            }
        }
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p.length;j++){
                if(q[i][j]){
                    System.out.println((i+1)+" "+(j+1));
                    y++;
                }
            }
        }
        if(y == 0) System.out.println(-1);
    }

    public static void in(boolean[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(input.nextInt() == 1){
                    a[i][j] = true;
                }
            }
        }
    }

    public static void test(boolean[][]a , boolean[][]b ,int m , int n){
        a[m][n] = true;
        if(isFive(a,m,n))b[m][n] = true;
        a[m][n] = false;
    }

    public static boolean isFive(boolean[][]a,int m,int n){
        return isfive1(a,m,n) || isfive2(a,m,n) || isfive3(a,m,n) || isfive4(a,m,n);
    }

    public static boolean isTrue(boolean[][]a,int m,int n){
        return m>=0 && m<a.length && n>=0 && n<a.length && a[m][n];
    }

    public static boolean isfive1(boolean[][]a,int m,int n){
        int k = 0;
        if(isTrue(a,m+1,n+1)){
            k++;
            if(isTrue(a,m+2,+n+2)){
                k++;
                if(isTrue(a,m+3,n+3)){
                    k++;
                    if(isTrue(a,m+4,n+4)){
                        k++;
                    }
                }
            }
        }
        if(isTrue(a,m-1,n-1)){
            k++;
            if(isTrue(a,m-2,n-2)){
                k++;
                if(isTrue(a,m-3,n-3)){
                    k++;
                    if(isTrue(a,m-4,n-4)){
                        k++;
                    }
                }
            }
        }
        return k >= 4;
    }
    public static boolean isfive2(boolean[][]a,int m,int n){
        int k = 0;
        if(isTrue(a,m+1,n-1)){
            k++;
            if(isTrue(a,m+2,n-2)){
                k++;
                if(isTrue(a,m+3,n-3)){
                    k++;
                    if(isTrue(a,m+4,n-4)){
                        k++;
                    }
                }
            }
        }
        if(isTrue(a,m-1,n+1)){
            k++;
            if(isTrue(a,m-2,n+2)){
                k++;
                if(isTrue(a,m-3,n+3)){
                    k++;
                    if(isTrue(a,m-4,n+4)){
                        k++;
                    }
                }
            }
        }
        return k >= 4;
    }
    public static boolean isfive3(boolean[][]a,int m,int n){
        int k = 0;
        if(isTrue(a,m+1,n)){
            k++;
            if(isTrue(a,m+2,n)){
                k++;
                if(isTrue(a,m+3,n)){
                    k++;
                    if(isTrue(a,m+4,n)){
                        k++;
                    }
                }
            }
        }
        if(isTrue(a,m-1,n)){
            k++;
            if(isTrue(a,m-2,n)){
                k++;
                if(isTrue(a,m-3,n)){
                    k++;
                    if(isTrue(a,m-4,n)){
                        k++;
                    }
                }
            }
        }
        return k >= 4;
    }
    public static boolean isfive4(boolean[][]a,int m,int n){
        int k = 0;
        if(isTrue(a,m,n-1)){
            k++;
            if(isTrue(a,m,n-2)){
                k++;
                if(isTrue(a,m,n-3)){
                    k++;
                    if(isTrue(a,m,n-4)){
                        k++;
                    }
                }
            }
        }
        if(isTrue(a,m,n+1)){
            k++;
            if(isTrue(a,m,n+2)){
                k++;
                if(isTrue(a,m,n+3)){
                    k++;
                    if(isTrue(a,m,n+4)){
                        k++;
                    }
                }
            }
        }
        return k >= 4;
    }
}
