/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ClassCodePtit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J03015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.subtract(b);
        System.out.println(c.toString());
    }
}
