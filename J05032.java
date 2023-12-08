package J05032;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class Person implements Comparable<Person>{
    private String ten;
    private int ngay, thang , nam;

    public Person(String ten, String ngay) {
        this.ten = ten;
        String[] s = ngay.split("/");
        this.ngay = Integer.parseInt(s[0]);
        this.thang = Integer.parseInt(s[1]);
        this.nam = Integer.parseInt(s[2]);
    }

    @Override
    public int compareTo(Person t) {
        if(nam == t.nam){
            if(thang == t.thang){
                if(ngay > t.ngay) return 1;
                else return -1;
            } else if(thang > t.thang){
                return 1;
            }
                else return -1;            
        } else if(nam > t.nam){
            return 1;
        } else return -1;
    }
    
    public String getTen(){
        return ten;
    }
}

public class J05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Person[] p = new Person[n];
        for(int i = 0; i < n; i++){
            String[] s = sc.nextLine().split("\\s+");
            p[i] = new Person(s[0], s[1]);
        }
        Arrays.sort(p);
        System.out.println(p[p.length - 1].getTen());
        System.out.println(p[0].getTen());
    }
}
