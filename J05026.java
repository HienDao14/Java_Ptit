package J05026;

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
        String[] words = ten.split("\\s+");
        return words[words.length - 1];
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

public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GiangVien[] a = new GiangVien[n];
        for(int i = 0; i < n; i++){
            a[i] = new GiangVien(sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String mon = sc.nextLine();
            String[] words = mon.toUpperCase().split("\\s+");
            String res = "";
            for(String i : words){
               res += i.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            for(GiangVien x : a){
                if(x.getMon().equals(res)){
                    System.out.println(x);
                }
            }
        }
    }
}
