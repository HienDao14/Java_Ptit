package J05024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class SinhVien{
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }
    
    public String getLop(){
        return lop;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
}

public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while(n-- > 0){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));           
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String khoa = sc.nextLine();
            khoa = khoa.toUpperCase();
            String nganh = "";
            if(khoa.equals("KE TOAN")) nganh = "DCKT";
            else if(khoa.equals("CONG NGHE THONG TIN")) nganh = "DCCN";
            else if(khoa.equals("AN TOAN THONG TIN")) nganh = "DCAT";
            else if(khoa.equals("VIEN THONG")) nganh = "DCVT";
            else if(khoa.equals("DIEN TU")) nganh = "DCDT";
            System.out.println("DANH SACH SINH VIEN NGANH " + khoa + ":");
            khoa = khoa.substring(2, 4);
            for(SinhVien x : list){
                if(x.getMa().substring(3, 7).equals(nganh)){ 
                    if((nganh.equals("DCCN") || nganh.equals("DCAT")) && x.getLop().charAt(0) == 'E'){
                        continue;
                    }
                    System.out.println(x);
                }
            }
        }
    }
}