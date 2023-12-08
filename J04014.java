package J04014;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class PhanSo{
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    
    public static long gcd(long a, long b){
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }
    
    public static PhanSo rutGon(PhanSo a){
        long gcd = gcd(a.tu, a.mau);
        PhanSo tmp = new PhanSo(a.tu / gcd, a.mau / gcd);
        return tmp;
    }
    
    public String toString(){
        return tu + "/" + mau;
    }    
}
public class J04014 {
    public static void solution(Scanner sc){
        PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
        
        PhanSo c = new PhanSo((long) Math.pow(a.getTu() * b.getMau() + b.getTu() * a.getMau(), 2),
                (long) Math.pow(a.getMau() * b.getMau(), 2));        
        c = PhanSo.rutGon(c);
        
        PhanSo d = new PhanSo(a.getTu() * b.getTu() * c.getTu(), a.getMau() * b.getMau() * c.getMau());
        d = PhanSo.rutGon(d);
        System.out.println(c + " " + d);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solution(sc);
        }
    }
}
