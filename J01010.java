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
public class J01010 {
    public static Scanner sc = new Scanner(System.in);
    
    public static long result(String s){
        long res = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case '0':
                case '8':
                case '9':
                    res = res * 10;
                    break;
                case '1':
                    res = res * 10 + 1;
                    break;
                default:
                    return 0;
            }
        }
        return res;
    }
    
    public static void testCase(){
        String s = sc.next();
        long n = result(s);
        if(n == 0) System.out.println("INVALID");
        else System.out.println(n);
    }
    
    public static void main(String[] args){
        int test = sc.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
}
