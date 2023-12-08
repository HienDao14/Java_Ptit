package J05009;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class ThiSinh implements Comparable<ThiSinh>{
    public static int IDX = 1;
    private int ma;
    private String ten, ns;
    private double diem;
    
    public ThiSinh(String ten, String ns, double diem1, double diem2, double diem3){
        this.ma = IDX++;
        this.ten = ten;
        this.ns = ns;
        this.diem = diem1 + diem2 + diem3;
    }
    
    public double getDiem(){
        return diem;
    }
    
    public int getMa(){
        return ma;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + ns + " " + String.format("%.1f", diem);
    }

    @Override
    public int compareTo(ThiSinh t) {
        if(this.diem == t.getDiem()){
            if(this.ma > t.getMa()) return 1;
            else return -1;
        }else{
            if(this.diem > t.getDiem()) return -1;
            else return 1;
        }
    }
}

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ThiSinh[] list = new ThiSinh[t];
        for(int i = 0; i < t; i++){
            list[i] = new ThiSinh(sc.nextLine(), sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(list);
//        for(ThiSinh i : list) System.out.println(i);
        int i = 0;
        System.out.println(list[i]);
        while(list[i].getDiem() == list[i + 1].getDiem()){
            System.out.println(list[i + 1]);
            i++;
        }
    }
}
