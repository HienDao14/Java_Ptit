package J05023;

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

    public String getLop() {
        return lop;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
}

public class J05023 {
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
            System.out.println("DANH SACH SINH VIEN KHOA " + khoa + ":");
            khoa = khoa.substring(2, 4);
            for(SinhVien x : list){
                if(x.getLop().substring(1, 3).equals(khoa)){
                    System.out.println(x);
                }
            }
        }
    }
}
