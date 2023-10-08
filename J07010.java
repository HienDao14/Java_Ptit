/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class SinhVien{
    public static int SV_IDX = 1;
    private String id, ten, lop, ns;
    private float gpa;
    
    public SinhVien(String ten, String lop, String ns, float gpa) throws ParseException{
        this.id = "B20DCCN" + String.format("%03d", SV_IDX++);
        this.ten = ten;
        this.lop = lop;   
        this.gpa = gpa;
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        this.ns = formatter.format(formatter.parse(ns));
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }    
}

public class J07010 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            SinhVien sv = new SinhVien(ten, lop, ns, gpa);
            System.out.println(sv);
        }
    }
}
