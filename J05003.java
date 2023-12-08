package J05003;

import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class SinhVien{
    public static int IDX = 1;
    private String ma, ten, lop, ns;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String ten, String lop, String ns, double gpa) {
        this.ma = "B20DCCN" + String.format("%03d", IDX++);
        this.ten = ten;
        this.lop = lop;
        this.ns = chuanHoa(ns);
        this.gpa = gpa;
    }
    
    public String chuanHoa(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, "0");
        }
        return sb.toString();
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}

public class J05003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        SinhVien[] sv = new SinhVien[t];
        for(int i = 0; i < t; i++){
            sv[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
        }
        for(SinhVien i : sv){
            System.out.println(i);
        }
    }
}
