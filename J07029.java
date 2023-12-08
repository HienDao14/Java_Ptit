package J07PTIT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
public class J07029 {
    public static int[] f = new int[1000001];
    public static void era(){
        Arrays.fill(f, 1);
        f[0] = f[1] = 0;
        for(int i = 2; i < 1000; i++){
            if(f[i] == 1){
                for(int j = i * i; j <= 1000000; j += i){
                    f[j] = 0;
                }
            }
        }
    }
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        era();
        ObjectInputStream ip = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> l = (ArrayList<Integer>) ip.readObject();
        int dem[] = new int[1000001];
        for(Integer x : l){
            dem[x] += f[x];
        }
        int d = 0;
        for(int i = 1000000; i >= 2; i--){
            if(dem[i] > 0){
                System.out.println(i + " " + dem[i]);
                d++;
                if(d == 10) break;
            }
        }
        ip.close();
    }
}
