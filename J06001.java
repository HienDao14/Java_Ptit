package J06001;

import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class SanPham{
    private String ma, ten;
    private long gia1, gia2;

    public SanPham(String ma, String ten, long gia1, long gia2) {
        this.ma = ma;
        this.ten = ten;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public long getGia1() {
        return gia1;
    }

    public long getGia2() {
        return gia2;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
}

class HoaDon {
    private static int IDX = 1;
    private String maHD;
    private long soLuong, giaTien ,thanhTien, giamGia, tongTien, loai;
    private SanPham sp;

    public HoaDon() {
    }

    public HoaDon(SanPham sp) {
        this.sp = sp;
    }

    public void setMaHD(String maHD){
        this.maHD = maHD + "-" + String.format("%03d", IDX++);
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }
    
    public void setLoai(int loai){
        this.loai = loai;
    }
    
    public void setGiaTien(){
        if(this.loai == 1){
            this.giaTien = this.sp.getGia1();
        } else this.giaTien = this.sp.getGia2();
    }
    
    public void setThanhTien(){
        this.thanhTien = soLuong * giaTien;
    }
    
    public void setGiamGia(){
        if(this.soLuong >= 150){
            this.giamGia = this.thanhTien * 50 /100;
        } else if(this.soLuong >= 100){
            this.giamGia = this.thanhTien * 30 /100;
        } else if(this.soLuong >= 50){
            this.giamGia = this.thanhTien * 15 /100;
        } else this.giamGia = 0;
    }
    
    public void setTongTien(){
        this.tongTien = this.thanhTien - this.giamGia;
    }

    public long getGiaTien() {
        return giaTien;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public long getGiamGia() {
        return giamGia;
    }

    public long getTongTien() {
        return tongTien;
    }
    
    @Override
    public String toString(){
        return maHD + " " + sp.getTen() + " " + giamGia + " " + tongTien;
    }
}

public class J06001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SanPham[] list = new SanPham[n];
        for(int i = 0; i < n; i++){
            list[i] = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < q; i++){
            String[] w = sc.nextLine().split("\\s+");
            String ten = w[0].substring(0,2);
            char loai = w[0].charAt(2);
            for(SanPham x : list){
                if(x.getMa().equals(ten)){
                    HoaDon hd = new HoaDon(x);
                    hd.setMaHD(w[0]);                    
                    hd.setLoai(w[0].charAt(2) - '0');
                    hd.setSoLuong(Long.parseLong(w[1]));
                    hd.setGiaTien();
                    hd.setThanhTien();
                    hd.setGiamGia();
                    hd.setTongTien();
                    System.out.println(hd);
                    break;
                }
            }
        }
    }
}
