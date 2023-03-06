import java.util.Scanner;

public class z5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, z;
        x = -2;
        y = 5;
        z = 13;
        boolean a = ((z>x)||(x<0))&&(z-y>9);
        System.out.println("Значение выражения: "+a);
    }
}
