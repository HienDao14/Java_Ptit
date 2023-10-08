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
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String[] a = sc.nextLine().trim().split("\\s+");
            for(String i : a){
                i = new StringBuilder(i).reverse().toString();
                System.out.print(i + " ");
            }           
            System.out.println();
        }
    }
}
