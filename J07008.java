/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07008 {
    static int n, a[] = new int[100];
    static int[] b = new int[100];
    static List<String> res;
    
    
    static void check() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(b[i] == 1){
                list.add(a[i]);
            }
        }
        if(list.size() >= 2){
            boolean isOke = true;
            for(int i = 1; i < list.size(); i++){
                if(list.get(i) <= list.get(i - 1)){
                    isOke = false;
                    break;
                }
            }
            if(isOke){
                String s = "";
                for(int i : list){
                    s += i + " ";
                }
                res.add(s);
            }            
        }
    }
    
    static void Try(int i){
        for(int j = 0; j <= 1; j++){
            b[i] = j;
            if(i == n - 1){
                check();
            }
            else {
                Try(i + 1);
            }
        }
    }

    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));                 
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        res = new ArrayList<>();
        Try(0);
        Collections.sort(res);
        for(String i : res){
            System.out.println(i);
        }
    }
}
