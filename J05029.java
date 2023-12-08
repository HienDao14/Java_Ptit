package J05029;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten;
    private int soLuong;

    public DoanhNghiep(String ma, String ten, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public int getSoLuong() {
        return soLuong;
    }

    @Override
    public int compareTo(DoanhNghiep t) {
        if(this.soLuong == t.getSoLuong()){
            return this.ma.compareTo(t.getMa());
        } else if(this.soLuong > t.getSoLuong()){
            return -1;
        }
        else return 1;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + soLuong;
    }
}

public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        DoanhNghiep[] arr = new DoanhNghiep[t];
        for(int i = 0 ; i < t; i++){
            arr[i] = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        Arrays.sort(arr);
        int q = sc.nextInt();
        while(q-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN "+ b + " SINH VIEN:");
            for(DoanhNghiep x : arr){
                int tmp = x.getSoLuong();
                if(tmp >= a && tmp <= b){
                    System.out.println(x);
                }
            }
        }      
    }
}
