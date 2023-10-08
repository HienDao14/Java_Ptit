/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07021 {
    
    public static String chuyenDoi(String s){
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            if(s.equals("END")){
                break;
            }
            String[] list = s.trim().split("\\s+");
            String res = "";
            for(String i : list){
                res += chuyenDoi(i) + " ";
            }
            System.out.println(res);
        }
    }
}
