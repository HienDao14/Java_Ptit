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
public class J03007 {
    public static boolean check(String s){
        int l = s.length();
        if(s.charAt(0) != '8' || s.charAt(l - 1) != '8'){
            return false;
        }
        int sum = 0;
        for(int i = 0; i <= l / 2; i++){
            if(s.charAt(i) != s.charAt(l - i - 1)){
                return false;
            }
        }
        for(int i = 0; i < l; i++){
            sum += (s.charAt(i) - '0');
        }
        if(sum % 10 != 0) return false;
        
        return true;
    }
    
    public static void main(String[] args) {             
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test; i++){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }               
            else{
                System.out.println("NO");
            }
        }                
    }
}
