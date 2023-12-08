package J07PTIT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HienDao
 */
public class J07015 {
    static int[] f = new int[10000];

    public static void era() {
        Arrays.fill(f, 1);
        f[0] = f[1] = 0;
        for (int i = 2; i <= 100; i++) 
            if (f[i] == 1) 
                for (int j = i * i; j < 10000; j += i) 
                    f[j] = 0;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        era();
        ObjectInputStream  ip = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        int d[] = new int[10000];
        List<Integer> a = (List<Integer>) ip.readObject();
        for(Integer x : a){
            d[x] += f[x];
        }
        for(int i = 0; i < 10000; i++){
            if(d[i] > 0){
                System.out.println(i + " " + d[i]);
            }
        }
        ip.close();
    }
}
