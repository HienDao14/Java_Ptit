/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten, trangThai;
    private double diemUuTien;
    private Double diemXetTuyen;
    
    public ThiSinh(String ma, String ten, double diemToan, double diemLy, double diemHoa){
        this.ma = ma;
        this.ten = chuanHoaTen(ten);
        switch(ma.substring(0, 3)){
            case "KV1":
                this.diemUuTien = 0.5;
                break;
            case "KV2":
                this.diemUuTien = 1;
                break;
            case "KV3":
                this.diemUuTien = 2.5;
                break;
        }
        this.diemXetTuyen = diemToan * 2 + diemLy + diemHoa + this.diemUuTien;
    }
    
    private String chuanHoaTen(String s){
        s = s.trim().replaceAll("\\s+", " ");
        String[] words = s.split("\\s+");
        String res = "";
        for(int i = 0; i < words.length; i++){
            res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            if(i != words.length - 1){
                res += " ";
            }
        }
        return res;
    }
    
    public void setTrangThai(String trangThai){
        this.trangThai = trangThai;
    }
    
    public Double getDiemXetTuyen(){
        return diemXetTuyen;
    }
    
    public String boSo0(double num){
        DecimalFormat format = new DecimalFormat("#.#");
        return format.format(num);
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + boSo0(diemUuTien) + " " + boSo0(diemXetTuyen) + " " + trangThai;
    }
    
    @Override
    public int compareTo(ThiSinh t) {
        return -(this.diemXetTuyen.compareTo(t.getDiemXetTuyen()));
    }    
}

public class J07052 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            double diemToan = Double.parseDouble(sc.nextLine());
            double diemLy = Double.parseDouble(sc.nextLine());
            double diemHoa = Double.parseDouble(sc.nextLine());
            ThiSinh tmp = new ThiSinh(ma, ten, diemToan, diemLy, diemHoa);
            list.add(tmp);
        }
        Collections.sort(list);
        
        int n = Integer.parseInt(sc.nextLine());
        double diemChuan = list.get(n - 1).getDiemXetTuyen();
        
        for(ThiSinh i : list){
            if(i.getDiemXetTuyen() >= diemChuan){
                i.setTrangThai("TRUNG TUYEN");
            } else {
                i.setTrangThai("TRUOT");
            }
        }
        System.out.println(String.format("%.1f", diemChuan));
        
        for(ThiSinh i : list){
            System.out.println(i);
        }
    }
}
