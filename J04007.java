/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J04Ptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

class NhanVien{
    
    private String id = "00001";
    private String name, gender, dob, address, tax, date;
    
    public NhanVien(){
         this.name = ""; this.gender = "";
         this.dob = ""; this.address = "";
         this.tax = ""; this.date = "";
    }
    
    public NhanVien(String name, String gender, String dob, String address, String tax, String date){
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.tax = tax;
        this.date = date;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + gender + " " + dob + " " + address + " " + tax + " " + date;
    }    
}

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String dob = sc.nextLine();
        String address = sc.nextLine();
        String tax = sc.nextLine();
        String date = sc.nextLine();
        NhanVien nvien = new NhanVien(name, gender, dob, address, tax, date);
        System.out.println(nvien);
    }
}
