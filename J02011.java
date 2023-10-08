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
public class J02011 {
    
    public static void out(int[] a, int n, int test){
        System.out.print("Buoc " + test + ": ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n - 1; i++){
            int min = a[i + 1];
            int idx = i + 1;
            for(int j = i + 2; j < n; j++){
                if(a[j] < min){
                    min = a[j];
                    idx = j;
                }
            }
            if(a[i] > min){
                int tmp = a[i];
                a[i] = min;
                a[idx] = tmp;
            }
            out(a, n, i + 1);
        }
     
    }
}
