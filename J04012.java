package J04012;

import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class NhanVien{
    private String ten, maNV;
    private int luongThang, phuCap;
    private int luongThuong , thuNhap;
    
    public NhanVien(String ten, int luongCoBan, int ngayCong, String chucVu){
        this.maNV = "NV01";
        this.ten = ten;
        this.luongThang = luongCoBan * ngayCong;
        if(ngayCong >= 25) this.luongThuong = this.luongThang * 20 / 100;
        else if(ngayCong >= 22) this.luongThuong = this.luongThang * 10 /100;
        else this.luongThuong = 0;
        switch(chucVu){
            case "GD": 
                this.phuCap = 250000;
                break;
            case "PGD":
                this.phuCap = 200000;
                break;
            case "TP":
                this.phuCap = 180000;
                break;
            default:
                this.phuCap = 150000;
        }
        this.thuNhap = luongThang + luongThuong + phuCap;
    }
    
    @Override
    public String toString(){
        return maNV + " " + ten + " " + luongThang + " " + luongThuong + " " + phuCap + " " + thuNhap;
    }
}

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
        System.out.println(nv);
                
    }
}
