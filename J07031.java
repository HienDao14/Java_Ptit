package J07PTIT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HienDao
 */
public class J07031 {
    public static boolean check(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n >= 2;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ip = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> ar1 = (ArrayList<Integer>) ip.readObject();
        Set<Integer> s1 = new TreeSet<>();
        for(int i : ar1){
            if(check(i)) 
                s1.add(i);
        }
        
        ip = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> ar2 = (ArrayList<Integer>) ip.readObject();
        
        for(Integer i : s1){
            if(i >= 1000000 - i){
                break;
            }
            if(s1.contains(1000000 - i) && !ar2.contains(i) && !ar2.contains(1000000 - i)){
                System.out.println(i + " " + (1000000 - i));
            }
        }
        ip.close();
    }
}
