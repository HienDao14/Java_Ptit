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
public class J01024 {
    
    public static void testCase(int n){
        while(n > 0){
            int chuSo = n % 10;
            if(chuSo != 1 && chuSo != 2 && chuSo != 0){
                System.out.println("NO");
                return;
            }
            n /= 10;
        }
        System.out.println("YES");
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            testCase(n);
        }
    }
}
