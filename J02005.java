/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassCodePtit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class J02005 {
    public static Scanner sc = new Scanner(System.in);
     
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] dem = new int[1005];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dem[a[i]] = 1;
        }
        
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        
        for(int i = 0; i < m; i++){
            if(dem[b[i]] == 1){
                System.out.print(b[i] + " ");
                dem[b[i]] = 0;
            }
        }
        
      
    }
}
