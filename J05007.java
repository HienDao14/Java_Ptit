package J05007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author HienDao
 */
class NhanVien implements Comparable<NhanVien>{
    
    public static int IDX = 1;
    private String ma, ten, gioiTinh, ns, diaChi, maThue, ngayKi;

    public NhanVien(String ten, String gioiTinh, String ns, String diaChi, String maThue, String ngayKi) {
        this.ma = String.format("%05d", IDX++);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ns = ns;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKi = ngayKi;
    }
    
    public String getNsSorted(String s){
        String res = "";
        String[] words = s.split("/");
        res = res + words[2] + words[1] + words[0];
        return res;
    }
    
    public String getNs(){
        return this.ns;
    }
    
    @Override
    public int compareTo(NhanVien t) {
        return this.getNsSorted(ns).compareTo(t.getNsSorted(t.getNs()));
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + gioiTinh + " " + ns + " " + diaChi + " " + maThue + " " + ngayKi;
    }
}

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        while(n-- > 0){
            list.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(NhanVien i : list){
            System.out.println(i);
        }
    }
}
