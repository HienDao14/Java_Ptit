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
public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0;
        for(int i = 1; i <= n; i++){
            int dem1 = 0;
            for(int j = 1; j <= 3; j++){
                int x = sc.nextInt();
                dem1 += x;
            }
            if(dem1 >= 2) dem++;
        }
        System.out.println(dem);
    }
}
