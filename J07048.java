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
class SanPham implements Comparable<SanPham>{
    private String ma, ten;
    private int gia, thang;
    
    public SanPham(String ma, String ten, int gia, int thang){
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.thang = thang;               
    }
    
    public int getGia(){
        return gia;
    }
    
    public String getMa(){
        return ma;
    }
    
    @Override
    public int compareTo(SanPham t) {
        if(this.gia == t.getGia()){
            return ma.compareTo(t.getMa());
        }
        return -(this.gia - t.getGia());
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + gia + " " + thang;
    }
}

public class J07048 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        SanPham[] a = new SanPham[n];
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int thang = Integer.parseInt(sc.nextLine());
            a[i] = new SanPham(ma, ten, gia, thang);
        }
        Arrays.sort(a);
        for(SanPham i : a){
            System.out.println(i);
        }
    }
}
