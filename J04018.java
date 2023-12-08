package J04018;

import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class SoPhuc{
    private int a, b;

    public SoPhuc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public static SoPhuc phepCong(SoPhuc o, SoPhuc t){
        SoPhuc tmp = new SoPhuc(o.a + t.a, o.b + t.b);
        return tmp;
    }
    
    public static SoPhuc phepNhan(SoPhuc o, SoPhuc t){
        SoPhuc tmp = new SoPhuc(o.a * t.a - o.b * t.b, o.a * t.b + o.b * t.a);
        return tmp;
    }
    
    public String toString(){
        if(b < 0){
            return a + " - " + (0 - b) + "i";
        }
        return a + " + " + b + "i"; 
    }
}

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc res1 = SoPhuc.phepCong(a, b);
            res1 = SoPhuc.phepNhan(res1, a);
            SoPhuc res2 = SoPhuc.phepCong(a, b);
            res2 = SoPhuc.phepNhan(res2, res2);
            System.out.println(res1 + ", " + res2);
        }
    }
}
