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
public class J01014 {
    public static Scanner sc = new Scanner(System.in);
    
    public static boolean isPrime(long n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void testCase(){
        long n = sc.nextLong();
        long res = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(isPrime(n / i)){
                    System.out.println(n/i);
                    return;
                }
                if(isPrime(i)) res = i;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
}
