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
public class J02007 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void testCase(int test){
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] d = new int[10001];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            d[a[i]]++;
        }
        System.out.println("Test " + test +":");
        for(int i = 0; i < n; i++){
            if(d[a[i]] != 0){
                System.out.println(a[i] + " xuat hien " + d[a[i]] + " lan");
                d[a[i]] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        for(int i = 1; i <= test; i++){           
            testCase(i);
        }
    }
}
