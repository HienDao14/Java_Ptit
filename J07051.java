/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class KhachHang implements Comparable<KhachHang>{
    public static int NUM_ID = 1;
    private String maKH, ten, soPhong;
    private int ngayO, tienPhong, tongTien;
    
    public KhachHang(String ten, String soPhong, Date ngayVao, Date ngayRoi, int tienPhi){
        this.maKH = String.format("KH%02d", NUM_ID++);
        this.ten = chuanHoaTen(ten);
        this.soPhong = soPhong;
        switch(soPhong.substring(0,1)){
            case "1":
                tienPhong = 25;
                break;
            case "2":
                tienPhong = 34;
                break;
            case "3":
                tienPhong = 50;
                break;
            case "4":
                tienPhong = 80;
                break;
        }
        this.ngayO = calculateTime(ngayVao, ngayRoi);
        this.tongTien = tienPhong * ngayO + tienPhi;
    }
    
    private String chuanHoaTen(String s){
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
    
    private int calculateTime(Date ngayVao, Date ngayRoi){
        long gioVao = ngayVao.getTime();
        long gioRa = ngayRoi.getTime();
        return (int) ((gioRa - gioVao) / (1000 * 60 * 60 * 24)) + 1;
    }
    
    public Integer getTongTien(){
        return tongTien;
    }
    
    @Override 
    public String toString(){
        return maKH + " " + ten + " " + soPhong + " " + ngayO + " " + tongTien;
    }
    
    @Override
    public int compareTo(KhachHang t) {
        return -(this.getTongTien().compareTo(t.getTongTien()));
    }    
}

public class J07051 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        while(n-- > 0){
            String ten = sc.nextLine().trim();
            String maPhong = sc.nextLine().trim();
            Date ngayVao = sdf.parse(sc.nextLine());
            Date ngayRoi = sdf.parse(sc.nextLine());
            int tienPhi = Integer.parseInt(sc.nextLine());
            KhachHang kh = new KhachHang(ten, maPhong, ngayVao, ngayRoi, tienPhi);
            list.add(kh);
        }       
        Collections.sort(list);
        for(KhachHang kh : list){
            System.out.println(kh);
        }
    }
}
