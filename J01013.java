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
public class J01013 {
    public static Scanner sc = new Scanner(System.in);
    public static final int N = (int) 2e6;
    public static int[] prime = new int[N + 5];
   
    public static void minDivisor(){
        for(int i = 2; i * i <= N; i++){
            if(prime[i] == 0) {
                for(int j = i; j <= N; j += i){
                       if(prime[j] == 0) prime[j] = i;
                }
            }
        }
        for(int i = 2; i <= N; i++){
            if(prime[i] == 0) prime[i] = i;
        }
    }
    
    public static long sum(int n){
        if(prime[n] == 0) return n;
        int s = 0;
        while(n != 1){
            s += prime[n];
            n /= prime[n];
        }
        return s;
    }
    
    public static void main(String[] args) {
        minDivisor();
        int t = sc.nextInt();
        long sum = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            sum += sum(n);
        }
        System.out.println(sum);
    }
}
