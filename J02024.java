/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ClassCodePtit;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class J02024 {
    public static int n, k, dem = 0;
    public static int[] a = new int[16];
    public static int[] b;
    
    public static boolean check(int n){
        for(int i = 2;  i < Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    
    public static void in(){        
        int sum = 0;
        for(int i = 1; i <= k; i++){
            sum += b[a[i]];
        }
        if(check(sum)){
            for(int i = 1; i <= k; i++){
                System.out.println(b[a[i]]);
            }
            System.out.println(" ");
        }
        
    }
            
    public static void Try(int i){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k) in();
            else Try(i + 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();                 
            b = new int[n + 1];
            for(int i = 1; i <= n; i++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(b);
            Try(1);
        }
    }
}
