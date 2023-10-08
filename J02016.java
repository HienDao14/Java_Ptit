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
public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            boolean ok = false;
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    long k = (long) Math.sqrt(a[i] * a[i] + a[j] * a[j]);
                    if(k * k != a[i] * a[i] + a[j] * a[j]){
                        break;
                    }
                    if(Arrays.binarySearch(a, k) > j){
                        ok = true;
                        break;
                    }
                }                               
            }
            if(ok){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}
