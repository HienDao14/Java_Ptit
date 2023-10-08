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
public class J01011 {
    public static Scanner sc = new Scanner(System.in);
    
    public static long gcd(long a, long b){
        while(b != 0){
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }
    
    public static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
    
    public static void testCase(){
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.println(lcm(a, b) + " " + gcd(a, b));
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
}
