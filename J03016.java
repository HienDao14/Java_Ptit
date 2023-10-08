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
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger n = sc.nextBigInteger();
            BigInteger a = new BigInteger("11");
            BigInteger k = n.divide(a);
            if(k.multiply(a).equals(n)){
                System.out.println("1");
            }
            else System.out.println("0");
        }
    }
}
