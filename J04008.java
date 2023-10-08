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
public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point[] p = new Point[3];
            for(int i = 0; i < 3; i++){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                p[i] = new Point(x, y);
            }
            double a = p[0].distance(p[1]);
            double b = p[0].distance(p[2]);
            double c = p[1].distance(p[2]);
            if(a + b > c && a + c > b && b + c > a){
                System.out.printf("%.3f\n", a + b + c);
            }
            else {
                System.out.println("INVALID");
            }
        }
    }
}
