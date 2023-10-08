/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ClassCodePtit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02014 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void testCase(){
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] left = new int[n];
        long sum = 0;
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
            if(i == 0) left[i] = a[i];
            else left[i] = left[i - 1] + a[i];
        }
        
        for(int i = 1; i < n; i++){
            if(left[i - 1] == sum - left[i]){
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("-1");
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
}
