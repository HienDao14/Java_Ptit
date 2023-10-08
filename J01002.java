
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
public class J01002 {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static void testCase(){
        long n = ip.nextLong();
        long s = n * (n + 1) / 2;
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        int test = ip.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
}
