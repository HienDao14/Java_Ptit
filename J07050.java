/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
class MatHang implements Comparable<MatHang>{

    public static int MA_MH = 1;
    private String ma, ten, nhom;
    private Float loiNhuan;
    
    public MatHang(String ten, String nhom, Float giaMua, Float giaBan){
        this.ma = "MH" + String.format("%02d", MA_MH++);
        this.ten =ten;
        this.nhom = nhom;
        this.loiNhuan = giaBan - giaMua;
    }
    
    public Float getLoiNhuan(){
        return loiNhuan;
    }
    
    @Override
    public int compareTo(MatHang t) {
        return -loiNhuan.compareTo(t.getLoiNhuan());
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan);
    }
}

public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] a = new MatHang[n];
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            Float giaMua = Float.parseFloat(sc.nextLine());
            Float giaBan = Float.parseFloat(sc.nextLine());
            a[i] = new MatHang(ten, nhom, giaMua, giaBan);
        }
        Arrays.sort(a);
        for(MatHang i : a) System.out.println(i);
    }
}
