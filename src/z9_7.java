import java.util.Scanner;

public class z9_7 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] args) {
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = 0;
        if (a + b < 180 && a != 0 && b != 0 && (a + b) != 0)
            c = 180 - a - b;
        else System.out.println("треугольника не существует");
        if (a == 90 || b == 90 || c == 90)
            System.out.println("Треугольник прямоугольный");
        if (a < 90 && b < 90 && c < 90)
            System.out.println("Треугольник остроугольный");
        if (a > 90 || b > 90 || c > 90)
            System.out.println("Треугольник тупоугольный");
        if ((a == b && a != c) || (a == c && a != c) || (b == c && a != c))
            System.out.println("Треугольник равнобедренный");
        if (a == 60 && b == 60 && c == 60)
            System.out.println("треугольник равносторонний");


    }
}
