
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
public class J01004 {
    public static Scanner sc = new Scanner(System.in);
    
    public static boolean checkSnt(int a){
        if(a < 2) return false;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0) return false;
        }
        return true;
    }
    
    public static void testCase(){
        int n = sc.nextInt();
        if(checkSnt(n)) System.out.println("YES");
        else System.out.println("NO");
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0) testCase();
    }
}
