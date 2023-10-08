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
public class J03021 {
    
    public static char change(char c){
        switch(c){
            case 'a':
            case 'b':
            case 'c':
                return '2';
            case 'd':
            case 'e':
            case 'f':
                return '3';
            case 'g':
            case 'h':
            case 'i':
                return '4';
            case 'j':
            case 'k':
            case 'l':
                return '5';
            case 'm':
            case 'n':
            case 'o':
                return '6';
            case 'p':
            case 'q':
            case 'r':
            case 's':
                return '7';
            case 't':
            case 'u':
            case 'v':
                return '8';            
        }
        return '9';
    }      
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next().toLowerCase();
            String res = "";
            for(int i = 0; i < s.length(); i++){
                res += change(s.charAt(i));
            }
            String rev = new StringBuilder(res).reverse().toString();
            if(res.equals(rev)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
