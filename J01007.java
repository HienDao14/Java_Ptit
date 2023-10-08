
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class J01007 {
      public static Scanner sc = new Scanner(System.in);
    public static long[] fb = new long[100];
    
    public static void fibo(){
        fb[1] = 0l;
        fb[2] = 1l;
        for(int i = 3; i <= 92; i++){
            fb[i] = fb[i - 1] + fb[i - 2];
        }
    }
    
    public static boolean isFibo(long n){
        for(long i : fb){
            if(i == n) return true;
            else if(i > n){
                return false;
            }
        }
        return false;
    }
    
    public static void testCase(){
        long a = sc.nextLong();
        if(isFibo(a)) System.out.println("YES");
        else System.out.println("NO");
    }
    
    public static void main(String[] args) {
        fibo();
        int test = sc.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
    
}
