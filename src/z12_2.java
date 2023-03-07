import java.util.Scanner;

public class z12_2 {
    public static Scanner in=new Scanner(System.in);
    public static void main (String[] args) {
        int x, even=0, odd=0 ;
        for (int i = 1; i <= 15; i++) {
            x = in.nextInt();
            if (i % 2 == 0) even++;
            else odd++;
        }
        System.out.printf("Количество четных чисел: %d\nКоличество нечетных чисел: %d", even, odd);
    }
}
