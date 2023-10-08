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
public class J02004 {
    public static Scanner sc = new Scanner(System.in);
    public static long[] arr = new long[105];
    
    public static boolean check(long[] arr, int n){
        for(int i = 0; i < n; i++){
            if(arr[i] != arr[n - i - 1]){
                return false;
            }
        }
        return true;
    }
    
    public static void testCase(){
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        if(check(arr, n)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            testCase();
        }    
    }
}
