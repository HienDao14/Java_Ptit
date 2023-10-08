/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J04Ptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

class Fraction{
    private long a, b;
    
    public Fraction(){
        a = 0;
        b = 1;
    }
    
    public Fraction(long a, long b){
        this.a = a;
        this.b = b;
    }
    
    private long gcd(long x, long y){
        while(y != 0){
            long z = x % y;
            x = y;
            y = z;            
        }
        return x;
    }
    
    @Override
    public String toString(){
        long g = gcd(this.a, this.b);
        return a / g + "/" + b / g;
    }
}

public class J04003 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        Fraction f = new Fraction(x, y);
        System.out.println(f);
    }
}
