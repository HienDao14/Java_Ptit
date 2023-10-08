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
public class J02020 {
    public static Scanner sc = new Scanner(System.in);
    public static int[] a = new int[10];
    public static int[] idx = new int[10];
    public static int n , k, dem;
    
    public static void in(){
        for(int i = 1; i <= k; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        dem++;
    }
            
    public static void Try(int i){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k) in();
            else Try(i + 1);
        }
    }
    
    public static void main(String[] args) {
        n = sc.nextInt(); 
        k = sc.nextInt();       
        dem = 0;
        Try(1);
        System.out.println("Tong cong co " + dem + " to hop");
    }
}
