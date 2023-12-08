package J05034;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class SinhVien implements Comparable<SinhVien>{
    private static int Idx = 1;
    private int stt;
    private String ma, ten, lop, email, dn;

    public SinhVien(String ma, String ten, String lop, String email, String dn) {
        this.stt = Idx++;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }
    
    public String getDN(){
        return dn;
    }        

    @Override
    public int compareTo(SinhVien t) {
        return this.ten.compareTo(t.ten);
    }
    
    @Override
    public String toString(){
        return stt + " " + ma + " " + ten + " " + lop + " " + email + " " + dn;
    }
}

public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] sv = new SinhVien[n];
        for(int i = 0; i < n; i++){
            sv[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                    sc.nextLine(), sc.nextLine());
        }        
        Arrays.sort(sv);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            for(SinhVien x : sv){
                if(x.getDN().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
