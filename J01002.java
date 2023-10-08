import java.util.Scanner;
/**
 *
 * @author HienDao
 */

public class J01002 {
    
    public static Scanner ip = new Scanner(System.in);
    
    public static void testCase(){
        long n = ip.nextLong();
        long s = n * (n + 1) / 2;
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        int test = ip.nextInt();
        while(test-- > 0){
            testCase();
        }
    }
}
