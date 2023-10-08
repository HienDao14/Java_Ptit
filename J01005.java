
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
public class J01005 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void testCase(){
        int n = sc.nextInt();
        int h = sc.nextInt();
        for(double i = 1d; i < n; i++){            
            System.out.printf("%.6f", h * Math.sqrt(i / n));
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
}
