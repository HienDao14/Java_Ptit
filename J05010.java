package J05010;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class MatHang implements Comparable<MatHang>{
    public static int IDX = 1;
    private int ma;
    private String ten, nhom;
    private double loiNhuan;

    public MatHang(String ten, String nhom, double giaMua, double giaBan) {
        this.ma = IDX++;
        this.ten = ten;
        this.nhom = nhom;
        this.loiNhuan = giaBan - giaMua;
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }

    @Override
    public int compareTo(MatHang t) {
        if(this.loiNhuan == t.getLoiNhuan()){
            return 0;
        } else if(this.loiNhuan > t.getLoiNhuan()){
            return -1;
        }
        else return 1;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan);
    }
}

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] list = new MatHang[n];
        for(int i = 0; i < n; i++){
            list[i] = new MatHang(sc.nextLine(), sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));           
        }
        Arrays.sort(list);
        for(MatHang x : list){
            System.out.println(x);
        }
    }
}
