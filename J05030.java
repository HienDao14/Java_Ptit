package J05030;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop;
    private float diem1, diem2, diem3;

    public SinhVien(String ma, String ten, String lop, float diem1, float diem2, float diem3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public int compareTo(SinhVien t) {
        return this.ma.compareTo(t.getMa());
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + diem1 + " " + diem2 + " " + diem3;
    }
}

public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] sv = new SinhVien[n];
        for(int i = 0; i < n; i++){
            sv[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                    Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));           
        }
        Arrays.sort(sv);
        for(int i = 0; i < sv.length; i++){
            System.out.println((i + 1) + " " + sv[i]);            
        }
    }
}
