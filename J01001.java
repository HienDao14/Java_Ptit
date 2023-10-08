
import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        int y = ip.nextInt();
        int chuVi = (x + y) * 2;
        int dienTich = x * y;
        if(x <= 0 || y <= 0) System.out.println("0");
        else System.out.println(chuVi + " " + dienTich);
    }
}
