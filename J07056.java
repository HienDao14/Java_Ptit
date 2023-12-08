package J07056;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class KhachHang implements Comparable<KhachHang>{
    private static int IDX = 1;
    private String ma, ten;
    private int tienTrong, tienVuot, thue, tong;
    
    public KhachHang(String ten, String loai, int soTruoc, int soSau){
        this.ma = "KH" + String.format("%02d", IDX++);
        this.ten = chuanHoa(ten);
        int soDien = soSau - soTruoc;
        int dinhMuc = 0;
        if(loai.equals("A")){
            dinhMuc = 100;
        } else if(loai.equals("B")){
            dinhMuc = 500;
        } else dinhMuc = 200;
        if(soDien > dinhMuc){
            this.tienTrong = dinhMuc * 450;
            this.tienVuot = (soDien - dinhMuc) * 1000;
        } else {
            this.tienTrong = soDien * 450;
            this.tienVuot = 0;
        }
        this.thue = this.tienVuot * 5 / 100;
        this.tong = this.tienTrong + this.tienVuot + this.thue;
    }
    
    private String chuanHoa(String s){
        s = s.trim().toLowerCase();
        String words[] = s.split("\\s+");
        String res = "";
        for(String x : words){
            res = res + x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        }
        return res.trim();
    }
    
    @Override
    public int compareTo(KhachHang t) {
        if(this.tong > t.tong){
            return -1;
        } else return 1;
    }   
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + tienTrong + " " + tienVuot + " " + thue + " " + tong;
    }
}

public class J07056 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        KhachHang[] a = new KhachHang[t];
        for(int i = 0; i < t; i++){
            String ten = sc.nextLine();
            String[] s = sc.nextLine().split("\\s+");                     
            a[i] = new KhachHang(ten, s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]));
        }
        Arrays.sort(a);
        for(KhachHang x : a){
            System.out.println(x);
        }
    }
}
