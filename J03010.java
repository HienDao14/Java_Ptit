/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ClassCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J03010 {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<String> dd = new ArrayList<>();
        while(t-- > 0){
            String[] a = sc.nextLine().trim().toLowerCase().split("\\s+");
            String s = a[a.length - 1];
            for(int i = 0; i < a.length - 1; i++){
                s += a[i].charAt(0);
            }
            dd.add(s);
            int dem = Collections.frequency(dd, s);
            if(dem == 1){
                s += "@ptit.edu.vn";
                System.out.println(s);
            }
            else {
                s += dem + "@ptit.edu.vn";
                System.out.println(s);
            }
        }
    }
}
