package J05011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class NguoiChoi implements Comparable<NguoiChoi>{
    private String ma, ten;
    private int thoiGian;

    public NguoiChoi(String ma, String ten, String vao, String ra) {
        this.ma = ma;
        this.ten = ten;
        int gioVao = Integer.parseInt(vao.substring(0, 2));
        int phutVao = Integer.parseInt(vao.substring(3));
        int gioRa = Integer.parseInt(ra.substring(0, 2));
        int phutRa = Integer.parseInt(ra.substring(3));
        this.thoiGian = (gioRa - gioVao) * 60 + (phutRa - phutVao);
    }

    public int getThoiGian() {
        return thoiGian;
    }      
    
    @Override 
    public String toString(){
        return ma + " " + ten + " " + thoiGian / 60 + " gio " + thoiGian % 60 + " phut";
    }

    @Override
    public int compareTo(NguoiChoi t) {
       if(this.thoiGian == t.getThoiGian()){
           return 0;
       } else if(this.thoiGian < t.getThoiGian()){
           return 1;
       }
       else return -1;
    }
    
    
}

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<NguoiChoi> list = new ArrayList<>();
        while(n-- > 0){
            list.add(new NguoiChoi(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(NguoiChoi x : list){
            System.out.println(x);
        }
    }
}
