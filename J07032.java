package J07PTIT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HienDao
 */
public class J07032 {
    public static boolean check(String s){
        if(s.length() % 2 == 0 || s.length() == 1){
            return false;
        }
        for(int i = 0; i <= s.length() / 2; i++){
            if((s.charAt(i) - '0') % 2 == 0){
                return false;
            }
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int[] f1= new int[1000001];
        int[] f2= new int[1000001];
        ObjectInputStream ip = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> l1 = (ArrayList<Integer>) ip.readObject();
        for(Integer x : l1){
            if(check(x.toString())){
                f1[x]++;
            }
        }
        ip = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> l2 = (ArrayList<Integer>) ip.readObject();
        for(Integer x : l2){
            if(check(x.toString())){
                f2[x]++;
            }
        }
        int d = 0;
        for(int i = 0; i <= 1000000; i++){
            if(f1[i] > 0 && f2[i] > 0){
                System.out.println(i + " " + (f1[i] + f2[i]));
                d++;
            }
            if(d == 10){
                break;
            }
        }
    }
}
