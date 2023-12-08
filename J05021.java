package J05021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class SinhVien implements Comparable<SinhVien>{
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
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
    
    @Override
    public int compareTo(SinhVien t) {
        return this.ma.compareTo(t.getMa());
    }
    
}

public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        List<SinhVien> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(SinhVien x : list){
            System.out.println(x);
        }
    }
}
