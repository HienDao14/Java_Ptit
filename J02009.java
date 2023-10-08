/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ClassCodePtit;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Admin
 */

class Pair{
    public int t;
    public int d;
    
    public Pair(int t, int d){
        this.t = t;
        this.d = d;
    }
}

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Pair> v = new Vector<>();
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            int d = sc.nextInt();
            Pair a = new Pair(t, d);
            v.add(a);
        }
        Collections.sort(v, new Comparator<Pair>(){
            @Override 
            public int compare(Pair a, Pair b){
                if(a.t > b.t){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });
        int h = 0;
        for(int i = 0; i < n; i++){
            if(h < v.get(i).t){
                h = v.get(i).t;
            }
            h += v.get(i).d;
        }
        System.out.println(h);
    }
}
