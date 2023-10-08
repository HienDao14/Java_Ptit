/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
class Khach implements Comparable<Khach>{
    public static int MA_KH = 1;
    private String maKh, ten, maP;
    private Long soNgay;
    public Khach(String ten, String maP,Long soNgay){
        this.maKh = "KH" + String.format("%02d", MA_KH++);
        this.ten = ten;
        this.maP = maP;
        this.soNgay = soNgay;
    }
    
    public Long getSoNgay(){
        return soNgay;
    }
    
    @Override
    public int compareTo(Khach t) {
        return -soNgay.compareTo(t.getSoNgay());
    }
    
    @Override
    public String toString(){
        return maKh + " " + ten + " " + maP + " " + soNgay;
    }
}

public class J07046 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        Khach[] a = new Khach[n];
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String maP = sc.nextLine();
            String ngayDen = sc.nextLine();
            String ngayDi = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate x = LocalDate.parse(ngayDen, formatter);
            LocalDate y = LocalDate.parse(ngayDi, formatter);
            Long time = ChronoUnit.DAYS.between(x, y);
            a[i] = new Khach(ten, maP, time);
        }
        Arrays.sort(a);
        for(Khach i : a){
            System.out.println(i);
        }
    }
}
