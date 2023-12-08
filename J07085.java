package J07085;

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
public class J07085 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ip = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> l = (ArrayList<String>) ip.readObject();

        for(String x : l){
            String res = "";
            int tong = 0;
            for(int i = 0; i < x.length(); i++){               
                if(Character.isDigit(x.charAt(i))){
                    res += x.charAt(i);   
                    tong = tong + (x.charAt(i) - '0');
                }
            }
            int i = 0;
            while(res.charAt(i) == '0'){
                i++;
            }
            String s = res.substring(i);            
            System.out.println(s + " " + tong);
        }
    }
}
