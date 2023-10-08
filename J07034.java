/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class MonHoc implements Comparable<MonHoc>{
    private String maMon, tenMon;
    private int tinChi;
    
    public MonHoc(String maMon, String tenMon, int tinChi){
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.tinChi = tinChi;
    }
    
    public String getTenMon(){
        return tenMon;
    }
    
    @Override 
    public String toString(){
        return maMon + " " + tenMon +  " " + tinChi;
    }
    
    @Override
    public int compareTo(MonHoc t) {
        return tenMon.compareTo(t.getTenMon());
    }    
}


public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        MonHoc[] a = new MonHoc[n];
        for(int i = 0; i < n; i++){
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            int tinChi = Integer.parseInt(sc.nextLine());
            a[i] = new MonHoc(maMon, tenMon, tinChi);            
        }
        Arrays.sort(a);
        for(MonHoc i : a){
            System.out.println(i);
        }
    }
}
