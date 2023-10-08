/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J04Ptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

class GiaoVien {
    private String ma, hoten;
    private int luongCoBan, bacLuong, luongPhuCap;
    
    public GiaoVien(){
        
    }
    public GiaoVien(String ma, String hoten, int luongCoBan){
        this.ma = ma;
        this.hoten = hoten;
        this.luongCoBan = luongCoBan;
        
        bacLuong = Integer.parseInt(ma.substring(2));
        
        if(ma.substring(0, 2).equals("HT")){
            luongPhuCap = 2000000;
        }
        else if(ma.substring(0, 2).equals("HP")){
            luongPhuCap = 900000;
        }
        else {
            luongPhuCap = 500000;
        }
    }
 
    public int getLuong(){
        return luongCoBan * bacLuong + luongPhuCap;
    }
    
    @Override
    public String toString(){
        return ma + " " + hoten + " " + bacLuong + " " + luongPhuCap + " " + getLuong();
    }
}

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String hoten = sc.nextLine();
        int luongCoBan = sc.nextInt();
        GiaoVien gv = new GiaoVien(ma, hoten, luongCoBan);
        System.out.println(gv);
    }
}
