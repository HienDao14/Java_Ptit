package J05037;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class MatHang implements Comparable<MatHang>{
    private static int IDX = 1;
    private String ma, ten, donVi;
    private long phi, thanhTien, giaBan;

    public MatHang(String ten, String donVi, double donGia, double soLuong) {
        this.ma = String.format("MH%02d", IDX++);
        this.ten = ten;
        this.donVi = donVi;
        this.phi = Math.round(donGia * soLuong * 5 / 100);
        this.thanhTien = Math.round(donGia * soLuong + phi);
        this.giaBan = Math.round((thanhTien + thanhTien * 2 / 100) / soLuong);
        this.giaBan = this.giaBan - this.giaBan % 100 + 100;
    }
    
    public String toString(){
        return ma + " " + ten + " " + donVi + " " + phi + " " + thanhTien + " " + giaBan;
    }

    @Override
    public int compareTo(MatHang t) {
        if(this.giaBan == t.giaBan){
            return 0;
        } else if(this.giaBan < t.giaBan){
            return 1;
        } else return -1;
    }
}

public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] list = new MatHang[n];
        for(int i = 0; i < n; i++){
            list[i] = new MatHang(sc.nextLine(), sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(list);
        for(MatHang x : list){
            System.out.println(x);
        }
    }
}
