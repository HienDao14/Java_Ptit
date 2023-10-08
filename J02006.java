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
public class J02006 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] d = new int[1005];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            d[a[i]] = 1;
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            d[b[i]] = 1;
        }
        for(int i = 1; i <= 1000; i++){
            if(d[i] == 1) System.out.print(i + " ");
        }
    }
}
