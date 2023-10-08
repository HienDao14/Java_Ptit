/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J04Ptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class MatHang implements Comparable<MatHang>{
    public static int idx_product = 1;
    
    private String ma, ten, donVi;
    private int giaMua, giaBan, loiNhuan;
    
    public MatHang(){
        
    }
    public MatHang(String ten, String donVi, int giaMua, int giaBan){
        this.ma = "MH" + String.format("%03d", idx_product++);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }
    
    public int getLoiNhuan(){
        return loiNhuan;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }
    
    @Override 
    public int compareTo(MatHang a){
        return a.getLoiNhuan() - this.loiNhuan;
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MatHang> list = new ArrayList<>(n);    
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String donVi = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            MatHang a = new MatHang(ten, donVi, giaMua, giaBan);
            list.add(a);
        }
        Collections.sort(list);
        for(MatHang i : list){
            System.out.println(i);
        }
    }
}
