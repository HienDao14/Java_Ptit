package J04019;

import java.util.Scanner;

/**
 *
 * @author HienDao
 */
class Point{
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc){
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        return new Point(a, b);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point b){
        double res = Math.sqrt((this.getX() - b.getX()) * (this.getX() - b.getX()) + (this.getY() - b.getY()) * (this.getY() - b.getY()));
        return res;
    }
}

class Triangle{
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid(){
        double d1 = a.distance(b);
        double d2 = b.distance(c);
        double d3 = a.distance(c);
        if(d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1){
            return true;
        }
        return false;
    }
    
    public String getPerimeter(){
        double d1 = a.distance(b);
        double d2 = b.distance(c);
        double d3 = a.distance(c);
        return String.format("%.3f", d1 + d2 + d3);
    }
}

public class J04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
