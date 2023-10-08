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

class Rectange{
    private double width;
    private double height;
    private String color;
    
    public Rectange(){
        width = 1;
        height = 1;
    }
    
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;        
    }
    
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    
    public String getColor(){
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public void setColor(String color){
        this.color = color;
    }
    
    double findArea(){
        return width * height;
    }
    
    double findPerimeter(){
        return (width + height) * 2;
    }
    
    @Override
    public String toString(){
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), getColor());
    }
}

public class J04002 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String c = sc.next();
        if(w > 0 && h > 0){
            Rectange r = new Rectange(w, h, c);
            System.out.println(r);
        }
        else {
            System.out.println("INVALID");
        }
    }
}
