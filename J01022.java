/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassCodePtit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J01022 {
    public static Scanner sc = new Scanner(System.in);
    public static long[] f = new long[100];
    
    public static void fibo(){
        f[1] = f[2] = 1;
        for(int i = 3; i < 100; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
    }
    
    public static char result(int n, long k){
        if(n == 1) return '0';
        if(n == 2) return '1';
        if(k <= f[n - 2]){
            return result(n - 2, k);
        }
        return result(n - 1, k - f[n - 2]);
    }
    
    public static void testCase(){
        int n = sc.nextInt();
        long k = sc.nextLong();
        System.out.println(result(n, k));
    }
    
    public static void main(String[] args) {
        fibo();
        int test = sc.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
}
