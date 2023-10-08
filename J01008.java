
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class J01008 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void testCase(int test){
        int n = sc.nextInt();       
        System.out.printf("Test %d: ", test);
        for(int i = 2; i <= Math.sqrt(n); i++){
            int cnt = 0;
            while(n % i == 0) {
                cnt++;
                n /= i;
            }
            if(cnt != 0){
                System.out.printf("%d(%d) ", i, cnt);
            }           
        }
        if(n != 1) System.out.printf("%d(1) ", n);
        System.out.println();
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
       for(int i = 1; i <= test; i++){
            testCase(i);
        }
    }
}
