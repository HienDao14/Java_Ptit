/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ClassCodePtit;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J03009 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void testCase(){
        String[] a = sc.nextLine().split(" ");
        String b = sc.nextLine();
        HashSet<String> s = new HashSet<>();
        for (String i : a){
            if(!b.contains(i)){
                s.add(i);
            }
        }
        for (String i : s){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            testCase();
        }
    }
}
