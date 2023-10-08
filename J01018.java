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
public class J01018 {
    public static Scanner sc = new Scanner(System.in);
    
    public static boolean isOke(char a, char b){
        int x = a - '0';
        int y = b - '0';
        return Math.abs(x - y) == 2;
    }
    
    public static void testCase(){
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length() - 1; i++){
            sum +=(s.charAt(i) - '0');
            if(!isOke(s.charAt(i), s.charAt(i + 1))){
                System.out.println("NO");
                return;
            }
        }
        sum += (s.charAt(s.length() - 1) - '0');
        if(sum % 10 == 0) System.out.println("YES");
        else System.out.println("NO");        
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
}
