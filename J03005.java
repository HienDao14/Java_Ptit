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
public class J03005 {
    public static Scanner sc = new Scanner(System.in);
    
    public static String chuanHoa(String s){
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        return s;
    }
    
    public static String chuanHoaHoTen(String s){
        s = chuanHoa(s);
        String tmp[] = s.split(" ");
        s = "";
        for(int  i = 1; i < tmp.length; i++){
            s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1).toLowerCase();
            if(i < tmp.length - 1){
                s += " ";
            }
        }
        s += ", ";
        s += tmp[0].toUpperCase();
        return s;
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(chuanHoaHoTen(s));
        }
    }
}
