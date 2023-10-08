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
public class J01021 {
    public static Scanner sc = new Scanner(System.in);
    public static final int mod = (int) 1e9 + 7;
    
    public static long pow(int a, long b){
        if(b == 0) return 1;
        if(b == 1) return a % mod;
        long tmp = pow(a, b / 2);
        if(b % 2 == 0) return (tmp * tmp) % mod;
        return (((tmp * tmp) % mod) * a) % mod;
    }
    
    public static void main(String[] args) {
        while(true){
            int a = sc.nextInt();
            long b = sc.nextLong();
            if(a == 0 && b == 0) return;
            System.out.println(pow(a, b));        
        }
    }
}
