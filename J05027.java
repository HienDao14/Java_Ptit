package J05027;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class GiangVien{
    private static int IDX = 1;
    private String ma, ten, mon;

    public GiangVien(String ten, String mon) {
        this.ma = "GV" + String.format("%02d", IDX++);
        this.ten = ten;
        this.mon = mon;
    }   
    
    public String getTen(){
        return ten;
    }
    
    public String getMon(){
        String[] words = mon.toUpperCase().split("\\s+");
        String res = "";
        for(String i : words){
            res += i.charAt(0);
        }
        return res;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + this.getMon();
    }
}

public class J05027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GiangVien[] a = new GiangVien[n];
        for(int i = 0; i < n; i++){
            a[i] = new GiangVien(sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(GiangVien x : a){
                String tmp = x.getTen().toLowerCase();
                s = s.toLowerCase();
                if(tmp.contains(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
