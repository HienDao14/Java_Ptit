package J04013;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class ThiSinh{
    private String ma, ten, trangThai;    
    private double tongDiem, diemUuTien;
    
    public ThiSinh(String ma, String ten, double diemToan, double diemLy, double diemHoa){
        this.ma = ma;
        this.ten = ten;
        this.tongDiem = diemToan * 2 + diemLy + diemHoa;
        if(ma.charAt(2) == '1') this.diemUuTien = 0.5;
        else if(ma.charAt(2) == '2') this.diemUuTien = 1;
        else this.diemUuTien = 2.5;
        if(this.tongDiem + this.diemUuTien >= 24) this.trangThai = "TRUNG TUYEN";
        else this.trangThai = "TRUOT";
    }
    
     public String boSo0(double num){
        DecimalFormat format = new DecimalFormat("#.#");
        return format.format(num);
    }
     
    @Override
    public String toString(){
        return ma + " " + ten + " " + boSo0(diemUuTien) + " " + boSo0(tongDiem) + " " + trangThai;
    }
}

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        System.out.println(ts);
        
    }
}
