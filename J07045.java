/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class LoaiPhong implements Comparable<LoaiPhong>{

    private String loai;
    private String ten;
    private int gia;
    private float phi;
    
    public LoaiPhong(String s){
        String[] ss = s.split("\\s+");
        this.loai = ss[0];
        this.ten = ss[1];
        this.gia = Integer.parseInt(ss[2]);
        this.phi = Float.parseFloat(ss[3]);        
    }
    
    public String getTen(){
        return ten;
    }
    
    @Override
    public int compareTo(LoaiPhong t) {
        return ten.compareTo(t.getTen());
    }    
    
    @Override
    public String toString(){
        return loai + " " + ten + " " + gia + " " + phi;
    }
}

public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
