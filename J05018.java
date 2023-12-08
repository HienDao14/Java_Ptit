package J05018;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class HocSinh implements Comparable<HocSinh>{
    private static int IDX = 1;
    private String ma, ten, xepLoai;
    private double diem;

    public HocSinh(String ten, double[] diem) {
        this.ma = "HS" + String.format("%02d", IDX++);
        this.ten = ten;
        this.diem = diem[0] * 2 + diem[1] * 2;
        for(int i = 2; i < 10; i++){
            this.diem += diem[i];
        }       
        this.diem = this.diem / 12f;
        if(this.diem >= 9) this.xepLoai = "XUAT SAC";
        else if(this.diem >= 8) this.xepLoai = "GIOI";
        else if(this.diem >= 7) this.xepLoai = "KHA";
        else if(this.diem >= 5) this.xepLoai = "TB";
        else this.xepLoai = "YEU";
    }

    public double getDiem() {
        return diem;
    }    
    
    public double getDiemKqua(){
        double res = Math.round(this.diem * 10f) / 10f;
        return res;
    }
    
    public String getMa() {
        return ma;
    }    
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + String.format("%.1f", this.getDiemKqua()) + " " + xepLoai;
    }
    
    @Override
    public int compareTo(HocSinh t) {
        if(this.diem == t.getDiem()){
            return this.ma.compareTo(t.getMa());
        } else if(this.diem < t.getDiem()){
            return 1;
        } else return -1;
    }    
}

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<HocSinh> list = new ArrayList<>();
        while(n-- > 0){
            double[] diem = new double[10];
            String ten = sc.nextLine();
            for(int i = 0; i < 10; i++){
                diem[i] = sc.nextDouble();
            }
            sc.nextLine();
            list.add(new HocSinh(ten, diem));
        }
        Collections.sort(list);
        for(HocSinh x : list) System.out.println(x);
    }
}
