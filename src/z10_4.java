import java.util.Random;
import java.util.Scanner;

public class z10_4 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] args){
        int a, b, c, d;
        a = in.nextInt();
        b = new Random().nextInt(a);
        c = new Random().nextInt(a);
        d = new Random().nextInt(a);
        System.out.printf("Введённое число: %d Три меньших числа: %d, %d, %d", a,b,c,d);
    }
}
