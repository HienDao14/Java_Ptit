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
public class J01012 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void testCase(){
        long n = sc.nextLong();
        long count = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i % 2 == 0) count++;
                if((n / i) % 2 == 0 && i != Math.sqrt(n)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
}
