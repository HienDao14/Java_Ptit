/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package J07PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class Student implements Comparable<Student>{
    private String id, ten, lop, email;
    
    public Student(String id, String ten, String lop, String email){
        this.id = id;
        this.lop = lop;
        this.email = email;
        
        String[] list = ten.trim().split("\\s+");
        String name = "";
        for(String i : list){
            name += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase();          
            if(i != list[list.length - 1]){
                name += " ";
            }
        }
        this.ten = name;
    }
    
    public String getId(){
        return id;
    }
    
    @Override 
    public String toString(){
        return id + " " + ten + " " + lop + " " + email;
    }
    
    @Override
    public int compareTo(Student b){
        return id.compareTo(b.getId());
    }
}

public class J07033 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        Student[] sv = new Student[n];
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            sv[i] = new Student(id, ten, lop, email);
        }
        Arrays.sort(sv);
        for(Student i : sv){
            System.out.println(i);
        }
    }
}
