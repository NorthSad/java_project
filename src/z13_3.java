import java.util.Scanner;
public class z13_3 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i < 20 + 1; i++) {
            int a = ((int)(Math.random() * 90 + 10));
            if (0==(i%2))
                sum += a;
                System.out.print(" "+a);
        }
        System.out.println("\nСумма: "+sum);
    }
}

