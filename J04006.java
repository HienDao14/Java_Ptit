/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J04Ptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class SVien{
    private String id = "B20DCCN001";
    private String name, lophoc, dob;
    private float gpa;
    
    public SVien(){
        this("", "", "", 0);
    }
    
    public SVien(String name, String lophoc, String dob, float gpa){
        this.name = name;
        this.lophoc = lophoc;
        this.dob = dob;
        this.gpa = gpa;
    }
    
    public String formatDob(){
        try {
            SimpleDateFormat newDob = new SimpleDateFormat("dd/MM/yyyy");
            Date date = newDob.parse(dob);
            return newDob.format(date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + lophoc + " " + formatDob() + " " + String.format("%.2f", gpa);
    }
}

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String dob = sc.nextLine();
        float gpa = sc.nextFloat();
        SVien stu = new SVien(name, lop, dob, gpa);
        System.out.println(stu);
    }
}
