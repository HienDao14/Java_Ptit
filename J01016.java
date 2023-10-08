/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassCodePtit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7') count++;
        }
        if(count == 4 || count == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
