
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class J01003 {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static void main(String[] args) {
        float a = ip.nextFloat();
        float b = ip.nextFloat();
        if(a == 0 && b == 0) System.out.println("VSN");
        else if(a == 0 && b != 0) System.out.println("VN");
        else System.out.printf("%.2f", -b/a);    
    }
}
