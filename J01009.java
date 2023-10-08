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
public class J01009 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        long n = sc.nextInt();
        long sum = 0; long tmp = 1;
        for(int i = 1; i <= n; i++){
            tmp *= i;
            sum += tmp;
        }
        System.out.print(sum);
    }
    
    
}
