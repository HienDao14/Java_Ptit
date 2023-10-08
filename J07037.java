/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class DN implements Comparable<DN>{
    private String maDN, tenDN;
    private int soSV;
    
    public DN(String maDN, String tenDN, int soSV){
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }
    
    public String getMaDN(){
        return maDN;
    }
    
    @Override 
    public String toString(){
        return maDN + " " + tenDN +  " " + soSV;
    }
    
    @Override
    public int compareTo(DN t) {
        return maDN.compareTo(t.getMaDN());
    }    
}


public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        DN[] a = new DN[n];
        for(int i = 0; i < n; i++){
            String maDN = sc.nextLine();
            String tenDN = sc.nextLine();
            int soSV = Integer.parseInt(sc.nextLine());
            a[i] = new DN(maDN, tenDN, soSV);            
        }
        Arrays.sort(a);
        for(DN i : a){
            System.out.println(i);
        }
    }
}
