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
public class J03024 {
    
    public static int check(String s){
        if(s.charAt(0) == '0'){
            return -1;
        }
        int chan = 0, le = 0;
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return -1;
            }
            if((s.charAt(i) - '0') % 2 == 0){
                chan++;
            }
            else le++;
        }            
        if((s.length() % 2 == 0 && chan > le) || (s.length() % 2 == 1 && chan < le)){
            return 1;
        }            
        else return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s) == 1){
                System.out.println("YES");
            } else if(check(s) == 0){
                System.out.println("NO");
            }
            else {
                System.out.println("INVALID");
            }
        }
    }
}
