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
public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger mul = a.multiply(b);
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = mul.divide(gcd);
            System.out.println(lcm);
        }
    }
}
