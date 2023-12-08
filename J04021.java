package J04021;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HienDao
 */
class IntSet{
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }

    public int[] getA() {
        return a;
    }
//    5 6
//22 33 88 7 99
//1 22 11 44 99 88
    public IntSet union(IntSet s2){        
        Set<Integer> h1 = new TreeSet<Integer>();        
        for(int i : this.a){
            h1.add(i);
        }        
         for(int i : s2.getA()){
             h1.add(i);
         }
        int[] tmp = new int[h1.size()];
        int idx = 0;
        for(int i : h1){
            tmp[idx] = i;
            idx++;
        }
        IntSet res = new IntSet(tmp);
        return res;
    }

    @Override
    public String toString(){
        String res = "";
        for(int i : this.a){
            res += i + " ";
        }
        return res.trim();
    }
}

public class J04021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
