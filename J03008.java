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
public class J03008 {
    public static boolean check(String s){
        int l = s.length();       
        for(int i = 0; i <= l / 2; i++){
            if(s.charAt(i) != s.charAt(l - i - 1)){
                return false;
            }
            if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7'){
                return false;   
            }
        }
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
