/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassCodePtit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[4];
        for(int i = 0; i < 4; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int result = Math.max(x[3] - x[0], y[3] - y[0]);
        System.out.println(result * result);
    }
}
